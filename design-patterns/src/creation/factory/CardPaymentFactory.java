package creation.factory;

public class CardPaymentFactory implements PaymentFactory{

  @Override
  public Payment createPayment() {
    return new CardPayment();
  }
}
