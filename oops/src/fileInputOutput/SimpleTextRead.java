package fileInputOutput;
import java.io.*;

public class SimpleTextRead {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("abc.Txt");
            int i=0;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
                fr.close();
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
