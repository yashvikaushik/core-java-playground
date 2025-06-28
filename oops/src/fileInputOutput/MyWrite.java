package fileInputOutput;
import java.io.*;
public class MyWrite {
    public static void main(String[] args) {
         FileOutputStream fout=null;
        try{
            fout=new FileOutputStream("null");
            String s="Success is no accident it is hardwork and determination and staying calm at the same time";
            byte b[]=s.getBytes();
            fout.write(b);
            //fout.close();
            System.out.println("file created successfully");
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            try{
                if(fout!=null)
               fout.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
            catch(NullPointerException e){
                System.out.println(e);
            }
        }
        }
    }
    

