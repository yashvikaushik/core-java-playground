package smartCalculator;
import java.util.*;
public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int  addIntegers[]=new int[5];
       char choice;
       do{
        Calculator calculator1=new Calculator(2, 3, 2, 4.0, 5.0, addIntegers);
        calculator1.menu(sc);
        System.out.println("Enter y to continue and n to exit");
        choice=sc.next().charAt(0);
       }

       while(choice=='y');
    }
    
}
