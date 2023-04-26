package creation.abstract_factory.first.windows;

import creation.abstract_factory.first.Button;

public class WindowsButton implements Button {

  public void paint() {
    System.out.println("Painting Windows button...");
  }
}