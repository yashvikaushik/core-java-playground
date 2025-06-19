package staticfields;
import java.util.*;
public class MathUtility {
//static block runs as soon as class is loaded in the memory
    static{
        System.out.println("Math Utility class Loaded!");
    }
// static methods do need an object for invocation    
    public static int findMax(int a,int b){
        if(a>b)
        return a;
        else 
        return b;
    }

    public static boolean isEven(int number){
        if(number%2==0)
        return true;
        else 
        return false;

    }

    public static int findFcatorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static boolean isPrime(int number){
        if(number%1==0 && number%number==0)
        return true;
        else 
        return false;
    }
    
    public static double power(double base,double exponent){
        return Math.pow(base,exponent);
    }

    public static void main(String args[]){
        System.out.println("Max: "+findMax(5,10));
        System.out.println("the number is even : "+isEven(25));
        System.out.println("The factorial: "+findFcatorial(5));
        System.out.println("is the number prime: "+isPrime(7));
        System.out.println("raised to the power: "+power(2, 04));

    }
}
