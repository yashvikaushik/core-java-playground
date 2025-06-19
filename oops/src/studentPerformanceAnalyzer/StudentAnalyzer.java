package studentPerformanceAnalyzer;
import java.util.*;
public class StudentAnalyzer {
    // attributes of the class declared as private
    private String name;
    private int rollNo;
    private int marks[];
    private double average;
    private char grade;

    //default constructor
    StudentAnalyzer(){

    }

    //parameterized constructor
    StudentAnalyzer(String name,int rollNo,int marks[],double average,char grade){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
        this.average=average;
        this.grade=grade;
     }

     // the getter methods which are to be declared as public always
     public String getName(){
        return name;
     }

      public int getrollNo(){
        return rollNo;
     }

      public int[] getMarks(){
        return marks;
     }

      public double getAverage(){
        return average;
     }

      public char getGrade(){
        return grade;
     }

     // the setter methods which also have to be declares as public
     public void setName(String name){
        this.name=name;
     }

     public void setrollNo(int rollNo){
        this.rollNo=rollNo;
     }

     public void setMarks(int[] marks){
        this.marks=marks;
     }

     public void setAverage(double average){
        this.average=average;
     }

     public void setGrade(char grade){
        this.grade=grade;
     }
     // getters and setters created


     public void calculateAverage(int[] marks){
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];

        }
        average=sum/marks.length;

     }

     public void assignGrade(double average){
        if (average>=90.0)
        grade='A';

        else if(average<90 && average>=70)
        grade='B';

        else if(average<70 && average>=50)
        grade='C';

        else if(average<50 && average>=40)
        grade='D';

        else 
        grade='F';
     }

     public void assignGrade(int[] marks){
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];

        }
        average=sum/marks.length;


         if (average>=90.0)
         grade='A';

        else if(average<90 && average>=70)
        grade='B';

        else if(average<70 && average>=50)
        grade='C';

        else if(average<50 && average>=40)
        grade='D';

        else 
        grade='F';

        System.out.println(grade);


     }
     // the to string method
     public String toString(){
      return "name: "+name +" grade: "+grade+" average: "+average+" marks: "+Arrays.toString(marks)+" ";
     }
}
