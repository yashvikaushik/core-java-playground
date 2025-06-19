package exerciseMethods;

public class Bank {
    String bankName;
    int licenseNumber;
    Customer customer[];

    Bank(String bankName,int licenseNumber,Customer customer[]){
        this.bankName=bankName;
        this.licenseNumber=licenseNumber;
        this.customer=customer;
     }
      public void displayDetails(){
        System.out.println("the name of the bank is: "+bankName);
        System.out.println("the license number of the customer is: "+licenseNumber);
        for(int i=0;i<customer.length;i++){
            customer[i].displayCustomerDetails();
        }
      }
    
}
