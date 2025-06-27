package generalExercise;

public abstract class Customer {
    protected String name;
    Customer(String name){
        this.name=name;
    }
     public String getName(){
        return name;
     }

     abstract public void getDiscount();


    
}
