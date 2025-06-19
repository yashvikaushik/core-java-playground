package Revision;

public class LibraryDemo {
    public static void main(String[] args) {
        Books book[]=new Books[5];
        //for(int i=0;i<book.length;i++){
            Publisher publisher=new Publisher("penguin", "dehradun", "123456789");
            book[0]=new Books("harry potter 1", "JK Rowling", publisher);
            book[1]=new Books("harry potter 2", "JK Rowling", publisher);
            book[2]=new Books("harry potter 3", "JK Rowling", publisher);
            book[3]=new Books("harry potter 4", "JK Rowling", publisher);
            book[4]=new Books("harry potter 5", "JK Rowling", publisher);


      //  }
        Library library=new Library("city library", "clock tower", book);
        library.displayLibrary();

    }
    
}
