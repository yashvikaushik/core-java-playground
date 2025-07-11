package hashSet;
import java.util.HashMap;
import java.util.Iterator;
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> country=new HashMap<Integer,String>();
        country.put(1,"India");
        country.put(2,"USA");
        country.put(3,"China");
        country.put(4,"Japan");
        country.put(5,"Maldives");

        for(int i: country.keySet() ){
            System.out.println("key: "+i+" value: "+country.get(i));

        }
            
        
    }
    
}
