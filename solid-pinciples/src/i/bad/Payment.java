package i.bad;

import java.util.List;

public interface Payment {
    void initiatePayments();
    Object status();
    List<Object> getPayments();

    // add two more methods
    void intiateLoanSettlement();
    void initiateRePayment();
}