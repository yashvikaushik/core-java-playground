package fileInputOutput;

import java.io.*;

public class MyDeserializer {
    public static void main(String[] args) {
        Address obj=null;
        try{
            FileInputStream fin=new FileInputStream("abc.Txt");
            ObjectInputStream oin=new ObjectInputStream(fin);
            obj=(Address)oin.readObject();
            oin.close();
            fin.close();
            System.out.println("Address: "+obj);



        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
