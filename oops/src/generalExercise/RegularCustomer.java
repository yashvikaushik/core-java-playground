package generalExercise;

public class RegularCustomer extends Customer {
    RegularCustomer(String name){
        super(name);
    }

    public void getDiscount(){
        System.out.println("hello, "+name+" your discount is 5%");
    }
    
}
