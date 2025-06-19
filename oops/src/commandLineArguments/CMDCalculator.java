package commandLineArguments;
import java.util.*;
public class CMDCalculator {
    public static void main(String[] args) {
        System.out.println("enter the operator and the values");
        String operator=args[0];
        System.out.println("the operator is: "+operator);
        int arr[]=new int[args.length-1];
        for(int i=1;i<args.length;i++){
            arr[i-1]=Integer.valueOf(args[i]);

        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        
        switch(operator){
            case "+": 
            int sum=0;
            for(int i=0;i<arr.length;i++){
                 sum+=arr[i];
            }
            System.out.println("Result: "+sum);
            break;

            case "*": 
            int product=1;
            for(int i=0;i<arr.length;i++){
                 product*=arr[i];
            }
            System.out.println("Result: "+product);

            case "-":
            int difference=arr[0];
            for(int i=1;i<arr.length;i++){
                 difference-=arr[i];
            }
            System.out.println("Result: "+difference);

            break;

             case "/":
            int quotient=arr[0];
            for(int i=1;i<arr.length;i++){
                 quotient/=arr[i];
            }
            System.out.println("Result: "+quotient);

            break;

            default: 
            System.out.println("wrong operator");
        }
       
        
        





    }
    
}
