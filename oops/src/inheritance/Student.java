package inheritance;

public class Student extends User {
     private char grade;
    Student(String name,String userID,char grade){
        super(name,userID);
        System.out.println("Student class constructor");
        this.grade=grade;
}
{
    System.out.println("instance block");
}

static{
    System.out.println("static block");
}

@Override
public void displayInfo(){
    super.displayInfo();
    System.out.println("grade: "+grade);
}

public char getGrade(){
    return grade;
}

public void setGrade(char grade){
    this.grade=grade;
}
    
}
