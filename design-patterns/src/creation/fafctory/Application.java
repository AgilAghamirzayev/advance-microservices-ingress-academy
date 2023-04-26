package creation.fafctory;

public class Application {

  public static void main(String[] args) {
    var paymentFactory = createPaymentFactoryByType(PaymentType.CARD);
    var payment = paymentFactory.createPayment();
    payment.pay();
  }

  private static PaymentFactory createPaymentFactoryByType(PaymentType type) {
    return switch (type) {
      case CARD -> new CardPaymentFactory();
      case CACHE -> new CachePaymentFactory();
    };
  }
}
