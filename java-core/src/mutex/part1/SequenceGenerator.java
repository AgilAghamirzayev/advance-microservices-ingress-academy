package mutex.part1;

public class SequenceGenerator {
  private int currentValue = 0;

  public int getNextSequence() {
    currentValue = currentValue + 1;
    return currentValue;
  }
}
