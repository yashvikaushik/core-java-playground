package fileInputOutput;
import java.io.*;
public class SimpleTextWrite {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("abc.Txt");
            fw.write("my name is yashvi");
            fw.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
