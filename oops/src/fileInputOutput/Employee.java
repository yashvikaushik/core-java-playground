package fileInputOutput;

import java.io.Serializable;

public class Employee implements Serializable {
     static final long serialVersionUID = 42L;
    //java beans
    private String name;
    private String id;
    private double salary;
    Employee(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

    }
    //getters
    public String getName(){
        return name;
    }

     public String getID(){
        return id;
    }

     public double getSalary(){
        return salary;
    }

    //setters
    public void setName(String name){
        this.name=name;
    }

     public void setID(String id){
        this.id=id;
    }

     public void setSalary(double salary){
        this.salary=salary;
    }

    //the toString()  method

    public String toString(){
        return "name: "+name+"\nID: "+id+"\nsalary: "+salary;

    }
    
}
