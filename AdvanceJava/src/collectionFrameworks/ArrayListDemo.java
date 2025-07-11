package collectionFrameworks;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList list =new ArrayList();
        list.add("yashvi");
        list.add("world");
        list.add(3.14);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        ArrayList <String> stringList=new ArrayList<String>();
        stringList.add("cat");
        stringList.add("dog");
        stringList.add("lion");

        for(String str:stringList){
            System.out.println(str);
        }


    }
    
}
