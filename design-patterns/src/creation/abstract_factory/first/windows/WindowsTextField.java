package creation.abstract_factory.first.windows;

import creation.abstract_factory.first.TextField;

public class WindowsTextField implements TextField {

  public void paint() {
    System.out.println("Painting Windows text field...");
  }
}