package eCommercePlatform;

public class Customer extends User {
    private String customerName;
    private String address;
    private String email;

    public Customer(String customerName,String address,String email,String userID,String password){
        super(userID,password);
        this.customerName=customerName;
        this.address=address;
        this.email=email;
    }

    public void register(){
        System.out.println(customerName+" has been registered successfully");
    }

    public String getCustomerName(){
        return customerName;
    }
     public String getAddress(){
        return address;
    }
     public String getEmail(){
        return email;
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

     public void setAddress(String address){
        this.address=address;
    }

      public void setEmail(String email){
        this.email=email;
    }

   public void displayCustomerDetails(){
    System.out.println("name of the customer: "+customerName);
    System.out.println("address of the customer: "+address);
    System.out.println("email of the customer: "+email);
    System.out.println();
}
    
}
