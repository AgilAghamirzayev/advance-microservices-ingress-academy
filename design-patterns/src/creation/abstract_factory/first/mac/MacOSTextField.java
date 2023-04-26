package creation.abstract_factory.first.mac;

import creation.abstract_factory.first.TextField;

public class MacOSTextField implements TextField {

  public void paint() {
    System.out.println("Painting MacOS text field...");
  }
}