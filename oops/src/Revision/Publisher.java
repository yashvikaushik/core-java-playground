package Revision;

public class Publisher 
{
    String name;
    String city;
    String contact;

    Publisher(String name,String city,String contact){
        this.name=name;
        this.city=city;
        this.contact=contact;
    }

    public void displayPublisherDetails(){
        System.out.println("the name of the publisher is: "+name);
         System.out.println("the city in which the publisher is situated is: "+city);
          System.out.println("the contact number of the publisher is: "+contact);
    }
    
}
