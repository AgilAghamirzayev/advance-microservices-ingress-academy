package o.second.bad;

import java.security.InvalidParameterException;

public class CalculatorImpl implements Calculator {

  @Override
  public void calculate(Operation operation) {
    if (operation == null) {
      throw new InvalidParameterException("operation cannot be null");
    }

    if (operation instanceof Addition) {
      Addition addition = (Addition) operation;
      addition.setResult(addition.getFirstNumber() + addition.getSecondNumber());
    } else if (operation instanceof Subtraction) {
      Subtraction subtraction = (Subtraction) operation;
      subtraction.setResult(subtraction.getFirstNumber() - subtraction.getSecondNumber());
    }
  }
}
