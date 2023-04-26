package creation.abstract_factory.first;

import creation.abstract_factory.first.windows.WindowsFactory;

public class WindowsApplication {

  public static void main(String[] args) {
    GUIFactory factory = new WindowsFactory();
    Button button = factory.createButton();
    TextField textField = factory.createTextField();
    button.paint();
    textField.paint();
  }
}