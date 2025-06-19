package studentPerformanceAnalyzer;
import java.util.*;
public class StudentAnalyzerDemo {
    public static void main(String[] args) {
        int marks[]={30,40,80};
        StudentAnalyzer student1=new StudentAnalyzer();
         StudentAnalyzer student2=new StudentAnalyzer("riya",25,marks,80,'A');
         student2.setName("rajesh");
         student2.assignGrade(marks);
         System.out.println(student2);

        
    }
    
}
