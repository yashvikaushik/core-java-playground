package eCommercePlatform;
import java.util.*;
public class ShoppingDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to the electronics world");
        System.out.println();

        Customer customer1=new Customer("riya","dehradun","priya@123","123","priya1");
        customer1.register();//fake registeration done

        customer1.login("123","priya1");
        customer1.login("123","wrongpassword");//testing if login works when user has entered a wrong password
         
        Product laptop=new Product(1001,"Laptop",50000.0);
        Product mouse=new Product(1002,"mouse",4000.0);
        Product keyboard=new Product(1003,"keyboard",10000.0);
        Product headphones=new Product(1004,"headphones",5000.0);
        Product chord=new Product(1005,"chord",500.0);
        Product sleeve=new Product(1006,"laptop sleeve",7000.0);
        Product stickers =new Product(1007,"stickers",300.0);
        Product cleanser=new Product(1008,"cleanser",150.0);
        Product pendrive=new Product(1009,"pendrive",5000.0);
        Product microphone=new Product(1010,"microphone",50000.0);
        Product stand=new Product(1011,"stand",5000.0);
    
  Order order1=new Order(1000, customer1);//order object created
  // adding products
order1.addProducts(laptop);
order1.addProducts(mouse);
order1.addProducts(keyboard);
order1.addProducts(headphones);
order1.addProducts(stickers);
order1.addProducts(sleeve);
order1.addProducts(chord);
order1.addProducts(pendrive);
order1.addProducts(microphone);
order1.addProducts(stickers);

order1.addProducts(cleanser);

order1.displayOrderDetails();
         
    }
    
}
