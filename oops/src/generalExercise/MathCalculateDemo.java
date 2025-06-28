package generalExercise;

public class MathCalculateDemo {
    public static void main(String[] args) {
        MathCalculator m1=new MathCalculator(0, 0, 0);

        try{
            int a=m1.divide(5, 5);
            System.out.println(a);
            System.out.println("---------------------");
            double b=m1.squareRoot(-9);
            System.out.println(b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        //catch block of the custom exception
        catch(NegativeNumberException e){
            System.out.println(e);
        }

    }
    
}
