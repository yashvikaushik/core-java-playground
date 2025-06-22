package practice;
import java.util.*;
public class StudentManagerApp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StudentManager studentManager= new StudentManager();
        Student student=null;
        
        char c;
        do{
            System.out.println("here is the menu choose the task that you want to do");
            System.out.println("1. Add Student \n 2. Find Student by Roll Number \n3. Exit");
            System.out.println("enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("you have chosen to add students ");
                System.out.println("enter your name");
                String name=sc.next();
                System.out.println("enter your rollNumber");
                String rollnum=sc.next();
                System.out.println("enter your grade");
                char grade=sc.next().charAt(0);
               
                    student=new Student(name, rollnum, grade);
                    studentManager.addStudent(student);

                
                break;

                case 2:
                System.out.println("you have chosen to find a student by roll number");
                System.out.println("enter the roll number of the student");
                String rn=sc.next();
                Student found=studentManager.findStudent(rn);
                if( found!=null){
                    found.displayDetails();
                    System.out.println(found);
                }
                else{
                    System.out.println("not found");
                } 
                break;

                case 3: System.out.println("exit");
                break;

                default:
                System.out.println("wrong choice");

            }

            System.out.println("do you want to continue");
            c=sc.next().charAt(0);
        }
        while(c=='y');

    }
    
}
