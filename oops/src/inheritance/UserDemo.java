package inheritance;

public class UserDemo {
    public static void main(String[] args) {
        User user=new User("priya","1001");
        user.displayInfo();
        System.out.println(".....................");
        Student student=new Student("aarohi","1002",'A');
        student.displayInfo();
        System.out.println(".....................");
        Teacher teacher=new Teacher("Bindu", "1001178", "literature");
        teacher.displayInfo(); 

    }
    
}
