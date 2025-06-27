package fileInputOutput;
import java.io.*;
public class SimpleRead2 {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("me2.Txt");
            BufferedInputStream bin =new BufferedInputStream(fin);
            int i=0;
            while((i=bin.read())!=-1){
                System.out.print((char)i);

            }
            bin.close();
            fin.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
