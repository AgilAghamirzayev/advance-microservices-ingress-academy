package o.second.bad;

public class Application {

  public static void main(String[] args) {
    CalculatorImpl calculator = new CalculatorImpl();
    Addition addition = new Addition(3, 1);
    calculator.calculate(addition);
    System.out.println(addition.getResult());

    Subtraction subtraction = new Subtraction(3, 1);
    calculator.calculate(subtraction);
    System.out.println(subtraction.getResult());
  }
}
