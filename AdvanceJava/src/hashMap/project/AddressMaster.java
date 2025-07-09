package hashMap.project;

public class AddressMaster {
     String country;
    String state;
    String street;
    String pinCode;

    AddressMaster(String country,String state,String street,String pinCode){
        this.country=country;
        this.state=state;
        this.street=street;
        this.pinCode=pinCode;

    }
    public String getState(){
        return state;
    }
    public String getCountry(){
        return country;
    }
    public String toString(){
        return "[country: "+country+" state: "+state+" street: "+street+" pinCode: "+pinCode+"]";
    }
    
}
