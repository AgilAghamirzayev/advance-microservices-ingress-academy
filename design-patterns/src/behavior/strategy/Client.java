package behavior.strategy;

import java.util.Arrays;

public class Client {

  public static void main(String[] args) {
    PrintStrategy[] printStrategy = {
        new LowercaseStrategy(),
        new UppercaseStrategy(),
        new RandomCaseStrategy()
    };

    String input = "THIS is a test STRING";

    Arrays.stream(printStrategy)
        .forEach(strategy -> new Executor(strategy).printString(input));

  }
}
