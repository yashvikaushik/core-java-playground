package abstractionPractice;

public abstract class Shape {
    abstract public void calculateArea();

     public void showType(String shape){
        System.out.println("the type of shape is: "+shape);
    }
    
}
