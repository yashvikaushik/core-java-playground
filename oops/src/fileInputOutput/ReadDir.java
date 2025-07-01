package fileInputOutput;
import java.io.File;
public class ReadDir {
    public static void main(String[] args) {
        File file=null;
        String paths[];
        try{
            file=new File("/Users/yashvikaushik/Documents/codeCoach");
            paths=file.list();

           /*  if(file.isDirectory()){
                System.out.println(file.getName()+"  <dir>");
            }*/
            

            for(String path:paths){
                 File f=new File(file,path);
                if(f.isDirectory()){
                   
                System.out.println(f.getName()+"  <dir>");
            }
            else{
                System.out.println(f.getName());
            }
                
                //System.out.println(path);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
