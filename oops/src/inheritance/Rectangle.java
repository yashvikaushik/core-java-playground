package inheritance;

public class Rectangle {
    private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.breadth = breadth;
	}

	public int area() {
		System.out.println("Area of rectangle called");
		return length * breadth;
	}

	// getters and setters
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
    
}
}
