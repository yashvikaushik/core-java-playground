package inheritance;

public class Box extends Rectangle {
     private int height;

    public Box(int length, int breadth, int height) {
        super(length, breadth);
        System.out.println("Box constructor called");
        this.height = height;

    }

    public int volume() {
        return area() * height;
    }

    //method overriding
     public int area() {
     System.out.println("Area of box called");
     return super.area() * height;
     }
    
}
