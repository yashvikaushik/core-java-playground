package Revision;

public class Book {
    String title;
    String author;
    double price;

    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;

    }

    public String toString(){
        return "title of the book: "+title+"\n author of the book: "+author+"\n price of the book: Rs"+price;
    }
    
}
