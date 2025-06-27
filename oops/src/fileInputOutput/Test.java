package fileInputOutput;
import java.io.*;
public class Test {
    public static void main(String[] args) {
        try{
        FileOutputStream fout =new FileOutputStream("me.Txt");
        String s="java is awesome so am i";
        byte b[]=s.getBytes();
        fout.write(b);
        fout.close();
        System.out.println("success");
    }
    catch(Exception e){
        System.out.println(e);

    }
    }
    
}
