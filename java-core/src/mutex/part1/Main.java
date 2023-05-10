package mutex.part1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Main {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    int count = 1000;
    Set<Integer> uniqueSequences = getUniqueSequences(new SequenceGeneratorUsingSemaphore(), count);
    System.out.println(uniqueSequences.size());
  }

  private static Set<Integer> getUniqueSequences(SequenceGenerator generator, int count)
      throws ExecutionException, InterruptedException {

    ExecutorService executor = Executors.newFixedThreadPool(3);
    Set<Integer> uniqueSequences = new LinkedHashSet<>();
    List<Future<Integer>> futures = new ArrayList<>();

    for (int i = 0; i < count; i++) {
      futures.add(executor.submit(generator::getNextSequence));
    }

    for (Future<Integer> future : futures) {
      uniqueSequences.add(future.get());
    }

    executor.awaitTermination(1, TimeUnit.SECONDS);
    executor.shutdown();

    return uniqueSequences;
  }
}