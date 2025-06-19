package Revision;

public class Library {
    String name;
    String location;
    Books book[];

    Library(String name,String location,Books book[]){
        this.name=name;
        this.location=location;
        this.book=book;
    }

    public void displayLibrary(){
        System.out.println("the name of the library is: "+name);
         System.out.println("the location of the library  is: "+location);
        for(int i=0;i<book.length;i++){
          book[i].displayBooks();
          System.out.println();
        }

    }
    
}
