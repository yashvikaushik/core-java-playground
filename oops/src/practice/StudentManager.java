package practice;

public class StudentManager {
    Student student[];
    int studentCount;

    StudentManager(){
        student=new Student[50];
        studentCount=0;

    }

    public void addStudent(Student s){
        if(studentCount<50){
            student[studentCount]=s;
            studentCount++;
        }
    }

    Student findStudent(String rollNum){
        for(int i=0;i<student.length;i++){
            if(student[i].getRollNumber().equals(rollNum)&& student[i]!=null)
            return student[i];
        }

        return null;

    }
    public Student[]  getStudents(){
        return student;
    }
}
