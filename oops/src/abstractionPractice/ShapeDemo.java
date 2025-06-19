package abstractionPractice;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle=new Circle(3,"circle");
        circle.calculateArea();
        circle.showType(circle.getShape());
        System.out.println("---------------------");
        Rectangle rectangle=new Rectangle(2,3,"rectangle");
        rectangle.calculateArea();
        rectangle.showType(rectangle.getShape());


    }
    
}
