package creation.abstract_factory.first;

import creation.abstract_factory.first.mac.MacOSFactory;

public class MacApplication {

  public static void main(String[] args) {
    GUIFactory factory = new MacOSFactory();
    Button button = factory.createButton();
    TextField textField = factory.createTextField();
    button.paint();
    textField.paint();
  }
}