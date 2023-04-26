package creation.abstract_factory.second;

import creation.abstract_factory.second.color.ColorFactory;

public class Application {

  public static void main(String[] args) {
    AbstractFactory factory = new ColorFactory();
    Shape shape = factory.createShape();
    Color color = factory.createColor();
    shape.draw();
    color.fill();
  }
}