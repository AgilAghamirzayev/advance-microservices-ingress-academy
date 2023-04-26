package creation.fafctory;

public class CardPaymentFactory implements PaymentFactory{

  @Override
  public Payment createPayment() {
    return new CardPayment();
  }
}
