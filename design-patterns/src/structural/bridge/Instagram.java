package structural.bridge;

public class Instagram implements App {

  private final PhoneOS os;

  public Instagram(PhoneOS os) {
    this.os = os;
  }

  @Override
  public void runApp() {
    System.out.println();
    os.display("Cached data");
    os.download("instagram.com");
    os.download("Instagram data");
    os.display("fresh data");
    System.out.println();
  }
}
