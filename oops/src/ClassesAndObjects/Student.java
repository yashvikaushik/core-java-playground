package ClassesAndObjects;

import java.util.Scanner;

public class Student {
    int age;
    String name;
    String universityName;
    String studentID;
    Student(){
        System.out.println("this is the default constructor");
        age=19;
        name="buffer";
        universityName="Bennett University";
        studentID="buffer";

    }
   Student(int age,String name,String universityName,String studentID){
    this.age=age;
    this.name=name;
    this.universityName=universityName;
    this.studentID=studentID;

   }
   public void input(Scanner sc){
    System.out.println("Enter the age of the student");
    age=sc.nextInt();
     sc.nextLine();
    System.out.println("Enter the name of the student");
    name=sc.nextLine();
    System.out.println("Enter the university of the student");
    universityName=sc.nextLine();
    System.out.println("Enter the  student ID");
    studentID=sc.nextLine();


   }

    public void display(){
        System.out.println("The name of the student is: "+name);
         System.out.println("The age of the student is: "+age);
          System.out.println("The student ID of the student is: "+studentID);
           System.out.println("university: "+universityName);}
    
}
