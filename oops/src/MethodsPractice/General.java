package MethodsPractice;
import java.util.*;
public class General {
    private String name;
    int rollNumber;
    protected static String collegeName;
    final String country ="India";
    static{
        collegeName="Bennett University";
        System.out.println("Static block called \n");

    }
    {
        System.out.println("instance block called \n");
    }
    General(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;

    }
    public void displayInfo(){
        System.out.println("your name is:" + name+"\n");
         System.out.println("your roll number is: "+rollNumber+"\n"); 
         System.out.println("you study in: "+collegeName+"\n");
          System.out.println("you live in: "+country+"\n");
          greetStudents();
    }
    private void greetStudents(){
        System.out.println("Hello !"+name);
    }
    public static void main(String[] args) {
        System.out.println("main method started \n");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your name");
     String name=sc.nextLine();
     System.out.println("Enter your roll number");
     int rollNumber=sc.nextInt();
        General obj=new General(name,rollNumber);
        obj.displayInfo();
    }


    
}
