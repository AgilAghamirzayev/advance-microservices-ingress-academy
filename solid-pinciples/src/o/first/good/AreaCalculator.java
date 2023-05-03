package o.first.good;

public class AreaCalculator {

  public static void main(String[] args) {
    double v = calculateArea(new Rectangle(2, 3));
    System.out.println(v);

    double v1 = calculateArea(new Circle(5));
    System.out.println(v1);
  }

  private static double calculateArea(Shape shape) {
    return shape.calculateArea();
  }
}
