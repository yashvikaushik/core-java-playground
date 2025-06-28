package fileInputOutput;
import java.io.*;
public class MyRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("note.Txt");
        int i=0;
        while((i=fin.read())!=-1){
            System.out.print((char)i);

        }
        fin.close();
    }
    
}
