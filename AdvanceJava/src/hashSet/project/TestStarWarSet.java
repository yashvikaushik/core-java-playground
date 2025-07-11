package hashSet.project;
import java.util.*;
public class TestStarWarSet {
    public void dumyData(){
        AddressUtil addressUtil=new AddressUtil();
        AddressMaster a=new AddressMaster("INDIA", "Uttarakhand", "aravali", "248001");
        AddressMaster b=new AddressMaster("INDIA", "Uttarakhand", "vasant vihar", "248001");
        AddressMaster c=new AddressMaster("INDIA", "Uttarakhand", "engineers enclave", "248001");
        AddressMaster d=new AddressMaster("INDIA", "Uttarakhand", "sarswati vihar", "248001");
        AddressMaster e=new AddressMaster("CANADA", "ontario", "young", "248001");
        AddressMaster f=new AddressMaster("CANADA", "ontario", "queen", "248001");
        AddressMaster g=new AddressMaster("CANADA", "ontario", "bay", "248001");
        AddressMaster h=new AddressMaster("CANADA", "quebec", "king", "248001");

        addressUtil.addAddress(a);
        addressUtil.addAddress(b);
        addressUtil.addAddress(c);
        addressUtil.addAddress(d);
        addressUtil.addAddress(e);
        addressUtil.addAddress(f);
        addressUtil.addAddress(g);
        addressUtil.addAddress(h);

        System.out.println(addressUtil.listUniqueContries());

        
        System.out.println(addressUtil.listUniqueStates());


    }

    public static void main(String[] args) {
        TestStarWarSet test=new TestStarWarSet();
        test.dumyData();
    }
    
}
