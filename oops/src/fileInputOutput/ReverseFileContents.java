package fileInputOutput;
import java.io.*;
public class ReverseFileContents {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("uppercase.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);

            FileOutputStream fout =new FileOutputStream("reverse.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            int i=0;
            char ch;
            String str="";
            String rev="";

            //while loop to read the data of the file and store in th string
            while((i=bin.read())!=-1){
                ch=(char)i;
                str+=ch;
            }

           //for loop to reverse the data and store in a new string
            for(int j=str.length()-1;j>=0;j--){
                char c=str.charAt(j);
                rev+=c;
            }

            //while loop to read and copy the new reversed data 
            byte b[]=rev.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            bin.close();
            fin.close();
            fout.close();

            System.out.println("the contents of the uppercase.txt  has been reversed and copied to reverse.txt");





        }
        catch(IOException e){
            System.out.println(e);

        }
    }
    
}
