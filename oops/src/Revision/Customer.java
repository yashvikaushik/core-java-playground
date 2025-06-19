package Revision;

public class Customer {
    String customerName;
    int accountNumber;
    Customer(String customerName,int accountNumber){
        this.customerName=customerName;
        this.accountNumber=accountNumber;

    }

     void display(){
        System.out.println("the name of the customer is: "+customerName);
        System.out.println("the account number of the customer is: "+accountNumber);
     }
    
}
