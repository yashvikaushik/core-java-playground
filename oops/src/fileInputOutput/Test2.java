package fileInputOutput;
import java.io.*;
public class Test2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout =new FileOutputStream("me2.Txt");
            BufferedOutputStream bout =new BufferedOutputStream(fout);
            String s="i am happy ";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
