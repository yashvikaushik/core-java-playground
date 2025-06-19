package inheritance;

public class Dog extends Animal {
    String breed;
    Dog(String name,int age,String breed){
      //the super keyword to exctract the constructorof the parent class
        super(name,age);
          System.out.println("child class constructor executed for Dog class");
        this.breed=breed;
    }

    //method overriding whre the method signature is same but body of the method changes
    @Override
    public void makeSound(){
        System.out.println("the dog barks");
    }

    public void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("breed: "+breed);

    }
    
}
