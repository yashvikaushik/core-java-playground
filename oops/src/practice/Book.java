package practice;

public class Book {
    private String title;
    private String author;
    boolean isBorrowed;

    Book(String title,String author){
        this.title=title;
        this.author=author;
        this.isBorrowed=false;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public void setIsBorrowed(boolean isBorrowed){
        this.isBorrowed=isBorrowed;
    }

    public void borrowBook(){
        isBorrowed=true;
    }
     public boolean isBorrowed(){
       return isBorrowed();
     }

     public void displayDetails(){
        System.out.println("title: "+title);
        System.out.println("author: "+author);
     }
}

