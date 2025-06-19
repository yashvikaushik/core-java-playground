package callByValueOrReference;

public class CallByReference {

    public static void update(Student s){
        s.setAge(10);
        s.setName("priya");

    }




    public static void main(String args[]){
    Student student1=new Student("yashvi",19,6,25);
    System.out.println("before updation "+student1);
    update(student1);
    System.out.println("after updation "+student1);


}


    
}
