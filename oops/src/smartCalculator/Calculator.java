package smartCalculator;
import java.util.Scanner;
public class Calculator {
    int a;
    int b;
    int c;
    double x;
    double y;
    int addIntegers[];


    Calculator(int a,int b,int c,double x,double y,int addIntegers[]){
        this.a=a;
        this.b=b;
        this.c=c;
        this.x=x;
        this.y=y;
        this.addIntegers=addIntegers;

    }

    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    public int add(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }

    public double add(double a,double b){
        double sum=a+b;
        return sum;
    }

    public int  multiply(int a,int b){
          int product=a*b;
          return product;
    }

    public int add(int addIntegers[]){
        int sum=0;
        for(int i=0;i<addIntegers.length;i++){
            sum+=i;
            
        }
        return sum;

    }



    public void menu(Scanner sc){
        System.out.println(".....WELCOME TO THE SMART CALCULATOR....");
        System.out.println("choose the function that you want to perform from the given menu");
        System.out.println("choose 1 to add two numbers of integer type");
        System.out.println("choose 2 to add three numbers of integer type");
        System.out.println("choose 3 to add two numbers of double type");
        System.out.println("choose 4 to multiply two numbers of integer type");
        System.out.println("choose 5 to add n numbers of integer type stored in an array");
        System.out.println("choose 6 to exit");

        System.out.println("enter your choice");
        int choice=sc.nextInt();
        int result=0;
        switch(choice){
            case 1:
            result=add( a, b);
            System.out.println("the result is: "+result);
            break;

            case 2:
             result=add( a, b,c);
            System.out.println("the result is: "+result);
            break;

            case 3:
            result=add( a, b);
            System.out.println("the result is: "+result);
            break;


            case 4:
            result=multiply( a, b);
            System.out.println("the result is: "+result);
            break;

            case 5:
            result=add(addIntegers);
            System.out.println("the result is: "+result);
            break;

            case 6:
            System.out.println("thank you! ");
            break;

            default:
            System.out.println("invalid choice!");

        }

    }

    
    
}
