package exerciseMethods;

public class Address {
    String street;
    String district;
    String state;
    int zipCode;
    Address(String street,String district,String state,int zipCode){
        this.street=street;
        this.district=district;
        this.state=state;
        this.zipCode=zipCode;
    }
    public void displayAddress(){
        System.out.println("adress: "+street+" "+district+" "+state+" "+ zipCode);
    }
    
}
