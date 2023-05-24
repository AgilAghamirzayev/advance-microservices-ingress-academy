package behavior.strategy1;

public class LowercaseStrategy implements PrintStrategy{

  @Override
  public String formatString(String input) {
    return input.toLowerCase();
  }
}
