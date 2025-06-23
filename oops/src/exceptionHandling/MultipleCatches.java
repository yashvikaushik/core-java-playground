package exceptionHandling;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
        int a=args.length;
        int b=42/a;
        int c[]={1};
        c[41]=12;
        }
        catch(ArithmeticException e){
            System.out.println("caught arithmetic excaption: "+e.getMessage());

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught array index out of bound exception: "+e.getMessage());
        }

        System.out.println("handled multiple exceptions succesfully");

    }
    
}
