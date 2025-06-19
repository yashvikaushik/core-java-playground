package callByValueOrReference;

public class Student {
    
    private String name;
    private int age;
    private int height;
    private int id;

    Student(){

    }

    Student(String name,int age,int height,int id){
        this.name=name;
        this.age=age;
        this.height=height;
        this.id=id;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id=id;
    }

    public int getHeight(){
        return height;
    }
    
    public void setHeight(int height){
        this.height=height;
    }

    public String toString(){
        return "name: "+name+" age: "+age+" id: "+id+" height: "+height;
    }
}

