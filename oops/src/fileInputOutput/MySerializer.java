package fileInputOutput;
import java.io.*;
public class MySerializer {
    public static void main(String[] args) {
        Address address=new Address("aravali", "A");
        try{
            FileOutputStream fout=new FileOutputStream("abc.Txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(address);
            out.close();
            fout.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
