package usingHashMap;
import java.util.*;
public class StudentManager {
    //Student student[];
   // ArrayList <Student> student=new ArrayList<Student>();

   HashMap <String,Student> students=new HashMap<String,Student>();

    //the studentCount field is no more required because the array list and HashMap manages the size manually
    int studentCount;

    StudentManager(){
        //student=new Student[50];
        studentCount=0;

    }

    public void addStudent(Student s){
        //simply adding a student each time the program will run
            students.put(s.getRollNumber(),s);
        
    }

    public Student findStudent(String rollNum){
            
            return students.get(rollNum);
        }

        

   
    public HashMap<String,Student> getStudents(){
        return students;
    }
}

    


    

