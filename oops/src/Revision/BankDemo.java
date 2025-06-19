package Revision;

public class BankDemo {
    public static void main(String[] args) {
        Customer customer=new Customer("ambaani", 123);
        Bank bank=new Bank("PNB","Clock tower",customer);
        bank.displayInfo();
    }
    
}
