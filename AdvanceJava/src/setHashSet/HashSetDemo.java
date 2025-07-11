package setHashSet;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
    public static void main(String[] args) {
        
    

    HashSet<String> bollywoodceleb=new HashSet<String>();
   bollywoodceleb.add("salman");
   bollywoodceleb.add("shahrukh");
   bollywoodceleb.add("aamir");
   bollywoodceleb.add("salman");

   Iterator itr=bollywoodceleb.iterator();
    
   while(itr.hasNext()){
    System.out.println(itr.next());

   }
System.out.println("................");
   for(String s:bollywoodceleb){
    System.out.println(s);

   }

    
}
}

