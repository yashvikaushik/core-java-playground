package exerciseMethods;
import java.util.*;
public class FakeBankDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bankName="";
        int licenseNumber=0;
        Customer customer[]=new Customer[5];
        for(int i=0;i<5;i++){

            System.out.println("for customer: "+(i+1));
            System.out.println("enter the bank name");
            bankName=sc.next();
            System.out.println("enter your license number");
             licenseNumber=sc.nextInt();
            System.out.println("enter your name");
            String name=sc.next();

            System.out.println("enter your age");
            int age=sc.nextInt();

            System.out.println("enter your street");
            String street=sc.next();

            System.out.println("enter your district");
            String district=sc.next();

            System.out.println("enter your state");
            String state=sc.next();

            System.out.println("enter your zip code");
            int zipCode=sc.nextInt();

            CustomerAddress address=new CustomerAddress(street, district, state, zipCode);
            customer[i]=new Customer(name, age, address);


        }
         Bank bank=new Bank(bankName,licenseNumber,customer);
            bank.displayDetails();
    }
    
}
