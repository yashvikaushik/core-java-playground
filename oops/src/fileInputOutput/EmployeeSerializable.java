package fileInputOutput;
import java.io.*;
public class EmployeeSerializable {
    public static void main(String[] args) {

        Employee employee=new Employee("alizeh", "c123", 500000);
        try{
            FileOutputStream fout=new FileOutputStream("employee.txt");
            BufferedOutputStream bout =new BufferedOutputStream(fout);
            ObjectOutputStream oout=new ObjectOutputStream(bout);
            oout.writeObject(employee);
            bout.flush();
            oout.close();
            bout.close();
            fout.close();


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
