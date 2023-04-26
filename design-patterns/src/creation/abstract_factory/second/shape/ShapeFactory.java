package creation.abstract_factory.second.shape;

import creation.abstract_factory.second.AbstractFactory;
import creation.abstract_factory.second.Color;
import creation.abstract_factory.second.Shape;
import creation.abstract_factory.second.color.Red;

public class ShapeFactory implements AbstractFactory {

  public Shape createShape() {
    return new Circle();
  }

  public Color createColor() {
    return new Red();
  }
}