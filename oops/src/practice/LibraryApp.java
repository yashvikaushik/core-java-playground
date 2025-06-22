package practice;
import java.util.*;
public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        Book book;
        char c=' ';
        do{
            System.out.println("here is the menu");
            System.out.println("1. Add New Book \n 2. Search Book by Title\n3. Borrow Book\n4. Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("you have choosen to add anew book");
                System.out.println("enter the author of the book");
                String author=sc.nextLine();
                sc.nextLine();
                 System.out.println("enter the title of the book");
                String title=sc.next();
                book=new Book(title, author);
                library.addBooks(book);

                break;


                case 2:
                System.out.println("you have chosen to search a book by its title");
                System.out.println("enter the title of the book that has to be found");
                String t=sc.next();
                Book foundBook=library.findBook(t);
                if(foundBook!=null){
                    System.out.println("book found");
                }
                else{
                    System.out.println("book not found");
                }

                break;

                case 3:
                System.out.println("you have chosen to borrow a book");
                System.out.println("enter the title of the book that you want to borrow");
                String b=sc.nextLine();
                 Book found=library.findBook(b);
                 if(found!=null){
                    System.out.println("book found");
                    if(!found.isBorrowed())
                    found.borrowBook();
                    else{
                        System.out.println("already borrowed");
                    }
                 }
                 else{
                    System.out.println("not found");
                 }

                 break;

                 case 4:
                 System.out.println("exit successful");
                 break;

                 default:
                System.out.println("wrong choice");
            }


                 System.out.println("do you want to continue");
            c=sc.next().charAt(0);


        }
        while(c=='y');
    }
    
}
