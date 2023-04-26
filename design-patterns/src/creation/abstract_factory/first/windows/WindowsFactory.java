package creation.abstract_factory.first.windows;

import creation.abstract_factory.first.Button;
import creation.abstract_factory.first.GUIFactory;
import creation.abstract_factory.first.TextField;

public class WindowsFactory implements GUIFactory {

  public Button createButton() {
    return new WindowsButton();
  }

  public TextField createTextField() {
    return new WindowsTextField();
  }
}
