package creation.factory;

public class CardPayment implements Payment{

  @Override
  public void pay() {
    System.out.println("Payed with card");
  }
}
