package ClassesAndObjects;

import java.util.Scanner;

public class StudentDemo {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student1= new Student();
        student1.input(sc);
        student1.display();
        System.out.println("\n  ........................");

         Student student2= new Student(19,"Diya","Shiv Nadar","Btech123");
         //student2.input(sc);
        student2.display();
          System.out.println("\n  ........................");


        Student student3=new Student();
         student3.display();
           System.out.println("\n  ........................");

}
}
