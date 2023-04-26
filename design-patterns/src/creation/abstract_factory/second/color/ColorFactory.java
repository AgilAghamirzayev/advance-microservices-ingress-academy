package creation.abstract_factory.second.color;

import creation.abstract_factory.second.AbstractFactory;
import creation.abstract_factory.second.Color;
import creation.abstract_factory.second.Shape;
import creation.abstract_factory.second.shape.Rectangle;

public class ColorFactory implements AbstractFactory {

  public Shape createShape() {
    return new Rectangle();
  }

  public Color createColor() {
    return new Blue();
  }
}