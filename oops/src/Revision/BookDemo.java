package Revision;
import java.util.*;

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title of the book");
        String title=sc.next();
        System.out.println("Enter the name of the book");
        String author=sc.next();
        System.out.println("Enter the price of the book");
        double price=sc.nextDouble();
        Book book=new Book(title,author,price);
        System.out.println(book);
        
    }
    
}
