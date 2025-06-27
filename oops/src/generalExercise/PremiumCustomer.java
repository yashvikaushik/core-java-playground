package generalExercise;

public class PremiumCustomer extends Customer{
    //string name; this is wrong as it shadows the parent feild and keeps it null 
    //which is why you were getting null printed instead od=f actual name 
    PremiumCustomer(String name){
        super(name);
    }

    public void getDiscount(){
        System.out.println("hello, "+name+" your discount is 15%");
    }
    
}
