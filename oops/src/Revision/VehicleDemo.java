package Revision;
import java.util.*;
public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the brand ");
        String brand=sc.next();
        System.out.println("enter the year ");
        int year=sc.nextInt();
        System.out.println("enter the model");
        String model=sc.next();
        
        System.out.println();

        Mercedes mercedes=new Mercedes(brand, year, model);
        mercedes.display();
        
    }
    
}
