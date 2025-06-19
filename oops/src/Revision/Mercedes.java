package Revision;

public class Mercedes extends Vehicle {

    String model;
    Mercedes(String brand,int year,String model){
        super(brand,year);
        this.model=model;

    }

    public void display(){
        super.display();
        System.out.println("model: "+model);
    }
    
}
