package fileInputOutput;
import java.io.*;
public class ReadSource {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("source.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i=0;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            
            System.out.println("\nsource file has been read");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
