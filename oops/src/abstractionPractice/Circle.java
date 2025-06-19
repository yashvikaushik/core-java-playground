package abstractionPractice;

public class Circle extends Shape {
    String shape;
    private int radius;
    Circle(int radius,String shape){
        this.radius=radius;
        this.shape=shape;
}
     public void setRadius(int radius){
        this.radius = radius;
     }

     public int getRadius(){
        return radius;

     }

      public String getShape(){
        return shape;

     }

     public void calculateArea(){
        System.out.println("area of circle is:"+(3.13*radius*radius));
     }

     





    
}
