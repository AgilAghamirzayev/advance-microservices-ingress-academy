package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample1 {

  public static void main(String[] args) {
    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    for (int i = 0; i < 5; i++) {
      int taskId = i;
      fixedThreadPool.submit(() -> {
        System.out.println("Executing task " + taskId + " on FixedThreadPool");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("Completed task " + taskId + " on FixedThreadPool");
      });
    }

    for (int i = 0; i < 5; i++) {
      int taskId = i;
      cachedThreadPool.submit(() -> {
        System.out.println("Executing task " + taskId + " on CachedThreadPool");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("Completed task " + taskId + " on CachedThreadPool");
      });
    }

    fixedThreadPool.shutdown();
    cachedThreadPool.shutdown();
  }
}
