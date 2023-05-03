package i.bad;

import java.util.ArrayList;
import java.util.List;

public class BankPayment implements Payment {

    @Override
    public void initiatePayments() {
        System.out.println("BankPayment.initiatePayments()");
    }

    @Override
    public Object status() {
        System.out.println("BankPayment.status()");
        return new Object();
    }

    @Override
    public List<Object> getPayments() {
        System.out.println("BankPayment.getPayments()");
        return new ArrayList<>();
    }

    @Override
    public void intiateLoanSettlement() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }

    @Override
    public void initiateRePayment() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }
}