package usingArrayList;
import java.util.*;
public class StudentManager {
    //Student student[];
    ArrayList <Student> student=new ArrayList<Student>();

    //the studentCount field is no more required because the array list manages the size manually
    int studentCount;

    StudentManager(){
        //student=new Student[50];
        studentCount=0;

    }

    public void addStudent(Student s){
        //simply adding a student each time the program will run
            student.add(s);
        
    }

    Student findStudent(String rollNum){
        //using the size() method in the loop instead of the leangth attribute of an array
        for(int i=0;i<student.size();i++){

            //instead of using student[i] to refer a student at the currebt index number student.get(index i) is used

            if(student.get(i).getRollNumber().equals(rollNum)&& student.get(i)!=null)
            return student.get(i);
        }

        return null;

    }
    public ArrayList<Student>  getStudents(){
        return student;
    }
}

    

