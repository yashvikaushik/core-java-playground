package fileInputOutput;
import java.io.*;
public class UpperCaseConverter {
    public static void main(String[] args) {
        try{
            BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("uppercase.txt"));
            FileInputStream fin=new FileInputStream("about_me.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i=0;
            while((i=bin.read())!=-1){
                char ch=(char)i;
               char upch= Character.toUpperCase(ch);
                bout.write(upch);

            }
            System.out.println("\nthe contents of the file: abou_me.txt has been successfuly copied to the file uppercase in uppercase ");
            bout.flush();
            bout.close();
            bin.close();
            fin.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
