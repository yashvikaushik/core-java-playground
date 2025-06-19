package Revision;

public class Books {
    String title;
    String author;
   Publisher publisher;

    Books(String title,String author,Publisher publisher){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
    }

    public void displayBooks(){
        System.out.println("the title of the book is: "+title);
         System.out.println("the author of the book is: "+author);
          publisher.displayPublisherDetails();
    }
    
}
