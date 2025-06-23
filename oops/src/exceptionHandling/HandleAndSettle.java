package exceptionHandling;

public class HandleAndSettle {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=1;
            //int b=0;
            int c=a/b;
            System.out.println("value of c: "+c);


        }
        catch(Exception e){
            System.out.println("exception handled: "+e.getMessage());
        }
        finally{
            System.out.println("good to go");
        }

        System.out.println("everything is fine now ");
    }
    
}
