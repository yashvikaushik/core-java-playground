package hashSet.project;
import java.util.ArrayList;
import java.util.HashSet;
public class AddressUtil {

   /*  AddressMaster address;
    AddressUtil(AddressMaster adress){
        this.address=adress;
    }*/

    ArrayList<AddressMaster> list=new ArrayList<AddressMaster>();
    HashSet<String> state=new HashSet<String>();
    HashSet<String> country=new HashSet<String>();
     public void addAddress(AddressMaster x){
        list.add(x);
    }

    public void deleteAddress(AddressMaster x){
        list.remove(x);
    }

    public void displayAddresses(){
        for(AddressMaster a:list){
            System.out.println(a);

        }
    }
    public HashSet<String> listUniqueContries(){
     for(int i=0;i<list.size();i++){
        country.add(list.get(i).getCountry());
     }
        
        return country;   
 }

 public HashSet<String> listUniqueStates(){
     for(int i=0;i<list.size();i++){
        state.add(list.get(i).getState());
     }
        
        return state;   
 }
    
}
