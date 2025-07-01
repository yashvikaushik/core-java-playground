package fileInputOutput;
import java.io.*;
public class EmployeeDeserializable {
    public static void main(String[] args) {
         Employee employee=null;
        try{
            FileInputStream fin=new FileInputStream("employee.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            ObjectInputStream oin=new ObjectInputStream(bin);
            employee=(Employee)oin.readObject();
            System.out.println(employee);
            oin.close();
            bin.close();
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
