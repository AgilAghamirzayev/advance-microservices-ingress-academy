package creation.fafctory;

public class CachePayment implements Payment {

  @Override
  public void pay() {
    System.out.println("Payed with cache");
  }
}
