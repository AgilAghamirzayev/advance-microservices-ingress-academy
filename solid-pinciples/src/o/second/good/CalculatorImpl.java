package o.second.good;

import java.security.InvalidParameterException;

public class CalculatorImpl implements Calculator {

  @Override
  public void calculate(Operation operation) {
    if (operation == null) {
      throw new InvalidParameterException("operation cannot be null");
    }

    operation.performOperation();
  }
}
