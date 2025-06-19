package stringPractice;
import java.util.*;
public class InitialsExercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you name,middle name and surname");
        String fullName=sc.nextLine().toUpperCase();
        fullName=fullName.trim();
        System.out.println("name: "+fullName);
        char Innitial1=fullName.charAt(0);
        int index1=fullName.indexOf(' ');
        String firstName=fullName.substring(0,(index1+1));
        System.out.println(firstName);

        int index2=fullName.lastIndexOf(' ');
        String middleName=fullName.substring((index1+1),index2);
        System.out.println(middleName);

        char Innitial2=middleName.charAt(0);

        String lastName=fullName.substring(index2+1);
        System.out.println(lastName);
         char Innitial3=lastName.charAt(0);
        System.out.println(Innitial1+" "+Innitial2+" "+Innitial3);
    
}
    
}
