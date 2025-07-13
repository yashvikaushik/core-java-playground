package inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        System.out.println();
         
        Animal animal=new Animal("sheru", 0);
        Dog dog=new Dog("sheero",2,"shitzu");
        dog.makeSound();
        dog.display();
        System.out.println();

        Cat cat=new Cat("baadal",4,"persian blue");
        cat.makeSound();
        cat.display();
        System.out.println();

        GoldenRetriever goldenRetriever=new GoldenRetriever("tommy", 3,"golden retriever", "ball");
        goldenRetriever.makeSound();

        System.out.println(".................");

        //Dynamic method calling and object creation iadhar memory is being allocated for dog
        //constructor uska call hoga jiske liye memory allocate hogi
        //left side waale ke attributes and right side waale ka behaviour(methods)
        Animal anotherAnimal=new Dog("tommy",3,"beagle");
        anotherAnimal.makeSound();
        System.out.println(goldenRetriever);
    }
    
}
