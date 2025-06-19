package interfaceDemo;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Upi transaction =new Upi(50000.0);
        transaction.pay(47000.0);
        transaction.refund(890.0);
    }
    
}
