package inheritance;

public class Animal {
    String name;
    int age;

    Animal(String name,int age){
        System.out.println("parent class constructor executed");
        this.name=name;
        this.age=age;
    }

    public void makeSound(){
        System.out.println("some generic animal sound!");
    }
    
}
