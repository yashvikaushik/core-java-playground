package exerciseMethods;

public class Customer {
    String name;
    int age;
    CustomerAddress customerAddress;

    Customer(String name,int age,CustomerAddress customerAddress){
        this.name=name;
        this.age=age;
        this.customerAddress=customerAddress;
    }

    public void displayCustomerDetails(){
        System.out.println("the name of the customer is: "+name);
        System.out.println("the age of the customer is: "+age);
        customerAddress.displayAddress();
    }
    
}
