package behavior.strategy1;

import java.util.Random;

public class RandomCaseStrategy implements PrintStrategy {

  @Override
  public String formatString(String input) {
    StringBuilder output = new StringBuilder();
    Random random = new Random();

    for (Character c : input.toCharArray()) {
      if (random.nextBoolean())
        output.append(c.toString().toUpperCase());
      else
        output.append(c.toString().toLowerCase());

    }

    return output.toString();
  }
}
