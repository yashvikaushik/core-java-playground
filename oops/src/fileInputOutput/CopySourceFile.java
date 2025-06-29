package fileInputOutput;
import java.io.*;
public class CopySourceFile {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("destination.txt");//file in which that content has to be copied
            BufferedOutputStream bout =new BufferedOutputStream(fout);

            FileInputStream orgfout=new FileInputStream("source.txt");//file whos content has to be copied in destination.txt
            BufferedInputStream orgbout=new BufferedInputStream(orgfout);

            int i=0;
            while((i=orgbout.read())!=-1){
                bout.write(i);
            }

            bout.flush();
            bout.close();
            fout.close();
            orgbout.close();
            orgfout.close();



        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
