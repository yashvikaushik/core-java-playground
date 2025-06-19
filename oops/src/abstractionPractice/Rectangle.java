package abstractionPractice;

public class Rectangle extends Shape {
    private int length;
    private int breadth;
    String shape;

    Rectangle(int length,int breadth,String shape){
        this.length=length;
        this.breadth=breadth;
        this.shape=shape;
    }

    public String getShape(){
        return shape;

     }

    public void calculateArea(){
        System.out.println("area of the rectangle is: "+(length*breadth));
    }

    public void setLength(int length){
        this.length=length;
    }

    public void setBreadth(int braedth){
        this.breadth=breadth;
    }

    public int getLength(){
        return length;
    }

     public int getBreadth(){
        return breadth;
    }


    
}
