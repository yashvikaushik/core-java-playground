package starWarsArrayList;

public class Address {
    String country;
    String state;
    String street;
    String pinCode;

    Address(String country,String state,String street,String pinCode){
        this.country=country;
        this.state=state;
        this.street=street;
        this.pinCode=pinCode;

    }
    public String toString(){
        return "[country: "+country+" state: "+state+" street: "+street+" pinCode: "+pinCode+"]";
    }
    
}
