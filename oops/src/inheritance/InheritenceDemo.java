package inheritance;

// Class definition
class Car {
    String brand;
    int year;

    // Method to display car info
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class InheritenceDemo {
     public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        System.out.println("Volume of box: " + box.volume());
        System.out.println("Area of box: " + box.area());

        // Rectangle rectangle = new Rectangle(10, 20);
        // System.out.println("Area of rectangle: " + rectangle.area());
    }
    
}
