package Revision;

public class Bank {
    String name;
    String address;
    Customer customer;
    Bank(String name,String address,Customer customer){
        this.name=name;
        this.address=address;
        this.customer=customer;
    }

    public void displayInfo(){
        System.out.println("the name of the bank is: "+name);
        System.out.println("the address of the customer is: "+address);
        customer.display();
    }
    
}
