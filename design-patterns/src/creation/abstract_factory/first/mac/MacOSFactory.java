package creation.abstract_factory.first.mac;

import creation.abstract_factory.first.Button;
import creation.abstract_factory.first.GUIFactory;
import creation.abstract_factory.first.TextField;

public class MacOSFactory implements GUIFactory {

  public Button createButton() {
    return new MacOSButton();
  }

  public TextField createTextField() {
    return new MacOSTextField();
  }
}