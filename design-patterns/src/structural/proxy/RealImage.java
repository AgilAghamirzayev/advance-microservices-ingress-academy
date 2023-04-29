package structural.proxy;

public class RealImage implements Image {
  private final String filename;


  public RealImage(String filename) {
    load(filename);
    this.filename = filename;
  }

  private static void load(String filename) {
    System.out.println("Real image: loading file: " + filename);
  }


  @Override
  public void display() {
    System.out.println("Real image: displaying file: " + filename);
  }
}
