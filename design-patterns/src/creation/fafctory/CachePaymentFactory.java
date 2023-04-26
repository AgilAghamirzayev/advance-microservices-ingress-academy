package creation.fafctory;

public class CachePaymentFactory implements PaymentFactory {

  @Override
  public Payment createPayment() {
    return new CachePayment();
  }
}
