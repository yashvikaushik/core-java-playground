package starWarsArrayList;
import java.util.*;
public class TestStarWarList {
    public void setUpDummyData(){
        Address a=new Address("india","uttarakhand","aravali","248001");
        Address b=new Address("india","uttarpradesh","vasant vihar","301205");
        Customer customer=new Customer("yashvi", 3,a);
        customer.showDetails();
        customer.addAddress(a);
        customer.addAddress(b);
        customer.deleteAddress(a);
        System.out.println();
        customer.listAddresses();
    }
    public static void main(String[] args) {
        TestStarWarList test=new TestStarWarList();
        test.setUpDummyData();
    }
}
