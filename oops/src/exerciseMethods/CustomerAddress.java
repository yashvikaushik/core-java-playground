package exerciseMethods;

public class CustomerAddress {
     String street;
    String district;
    String state;
    int zipCode;
    CustomerAddress(String street,String district,String state,int zipCode){
        this.street=street;
        this.district=district;
        this.state=state;
        this.zipCode=zipCode;
    }
    public void displayAddress(){
        System.out.println("the address of customer is: "+street+" "+district+" "+state+" "+ zipCode);
    
}
}
