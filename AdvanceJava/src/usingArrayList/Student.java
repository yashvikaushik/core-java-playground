package usingArrayList;

public class Student {
     private String name;
   private String rollNumber;
   private char grade;

   Student(String name,String rollNumber,char grade){
    this.name=name;
    this.rollNumber=rollNumber;
    this.grade=grade;
   }

   public void displayDetails(){
    System.out.println("name: "+name);
    System.out.println("roll Number: "+rollNumber);
    System.out.println("grade: "+grade);

   }

   public String getName(){
    return name;
   }

   public String getRollNumber(){
    return rollNumber;
   }


   public char getGrade(){
    return grade;
   }

   public void setGrade( char grade){
    this.grade=grade;
   }


    
}
