package exceptionHandling;

public class HandleException {
    public static void main(String[] args) {
        int a,b,c;
        try{
            a=10;
            b=0;
            c=a/b;
            System.out.println(c);

        }
        catch(ArithmeticException e){
            System.out.println("exception handled: "+e);

        }
        System.out.println("sucessful exception handling");
    }
    
}
