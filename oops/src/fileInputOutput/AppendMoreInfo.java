package fileInputOutput;
import java.io.*;
public class AppendMoreInfo {   
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("about_me.txt",true);
            BufferedWriter b=new BufferedWriter(f);
            String s="more info has been appended";
            b.write(s);
            b.flush();
            b.close();
            f.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
