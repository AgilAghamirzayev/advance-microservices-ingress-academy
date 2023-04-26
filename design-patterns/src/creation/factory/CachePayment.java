package creation.factory;

public class CachePayment implements Payment {

  @Override
  public void pay() {
    System.out.println("Payed with cache");
  }
}
