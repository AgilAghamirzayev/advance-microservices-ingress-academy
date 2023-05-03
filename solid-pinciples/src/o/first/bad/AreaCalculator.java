package o.first.bad;

public class AreaCalculator {

  public static void main(String[] args) {
//    calculateRectangleArea()
//    calculateCircleArea()
  }

  public static double calculateRectangleArea(Rectangle rectangle) {
    return rectangle.getLength() * rectangle.getWidth();
  }

  public static double calculateCircleArea(Circle circle) {
    return Math.PI * circle.getRadius() * circle.getRadius();
  }
}
