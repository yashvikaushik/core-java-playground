
package stringPractice;
import java.util.*;
public class StringInitials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName=sc.nextLine();
        //using the split() method
        System.out.println("using the split() method");
        String words[]=fullName.split(" ");
        for(int i=0;i<words.length;i++){
            char ch;
            ch=words[i].charAt(0);
            System.out.print(Character.toUpperCase(ch)+" ");
         }
         System.out.println();

         //using stringtokenizer
         System.out.println("using the StringTokenizer");

         StringTokenizer word=new StringTokenizer(fullName);
         while(word.hasMoreTokens()){
            String str=word.nextToken();
            char ch=str.charAt(0);
             System.out.print(Character.toUpperCase(ch)+" ");
         }
    }
    
}


