package exerciseMethods;

public class StudentDemo {
    public static void main(String[] args) {
        
    
    Address adress=new Address("vasant vihar", "dehradun", "uttarakhand", 248001);

    Student student=new Student("yashvi", 19, adress);

    student.displayInfo();
    }
    
}
