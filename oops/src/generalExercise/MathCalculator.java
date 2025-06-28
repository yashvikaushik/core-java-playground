package generalExercise;

public class MathCalculator {
    int a;
    int b;
    int x;
    MathCalculator(int a,int b,int x){
        this.a=a;
        this.b=b;
        this.x=x;

    }

    public int divide(int a,int b){
        if(b==0){
            throw new ArithmeticException("cannot divide by zero");
        }
        else{
            System.out.println("calculated result is: ");
            return a/b;
            
        }
    }

    public double squareRoot(int x) throws NegativeNumberException{
        if(x<0){
            throw new NegativeNumberException("cannot conclude the square root of a negative number");
        }
        else{
            System.out.println("calculated result is: ");
            return Math.sqrt(x);
        }
    }

    
}
