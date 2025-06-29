package fileInputOutput;
import java.io.*;
public class WriteAboutMyself {
    public static void main(String[] args) {
        try{
            FileWriter fin=new FileWriter("about_me.txt");
            BufferedWriter bin=new BufferedWriter(fin);
            String s="my name is yashvi \n i love coding \n i love in noida... ";
            bin.write(s);
            bin.flush();
            bin.close();
            fin.close();
            System.out.println("file created successfuly");

        }
catch(IOException e){
    System.out.println(e);
}        
    }
    
}
