package fileInputOutput;
import java.io.*;
public class WriteSoure {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("source.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String s="this is the source file";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("source file is generated and written");

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
