package exerciseMethods;

public class Student {
    String name;
    int age;
    Address adress;
    Student(String name,int age,Address address){
        this.name=name;
        this.age=age;
        this.adress=address;

    }

    public void displayInfo(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        adress.displayAddress();
    }
    
}
