package practice;

public class Library {
    private Book book [];
    int countBook;

    Library(){
        book=new Book[50];
        countBook=0;

    }
    
    public Book[] getBook(){
        return book;
    }

    public void addBooks(Book b){
        if(countBook<book.length){
            book[countBook]=b;
            countBook++;

        }
        else{
            System.out.println("no more books can be added ");
        }
    }

    public Book findBook(String t){
        for(int i=0;i<getBook().length;i++){
            if(t.equals(book[i].getAuthor() )&& t!=null){

              return book[i];
           
            }
        }
          return null;

    }
}
