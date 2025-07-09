package starWarsArrayList;
import java.util.*;
public class Customer {
    String name;
    int quantity;
    Address address;
    ArrayList <Address> addressList=new ArrayList<Address>();

    Customer(String name,int quantity,Address address){
        this.name=name;
        this.quantity=quantity;
        this.address=address;

    }

    public void showDetails(){
        System.out.println("name: "+name);
        System.out.println("quantity: "+quantity);
        System.out.println("address: "+address);
    }

    public void addAddress(Address x){
        addressList.add(x);

    }

    public void deleteAddress(Address x){
        addressList.remove(x);

    }


    public void listAddresses(){
        for(int i=0;i<addressList.size();i++){
            System.out.println(addressList.get(i));
        }
    }
    
}
