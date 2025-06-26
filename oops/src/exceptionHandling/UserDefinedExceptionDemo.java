package exceptionHandling;


public class UserDefinedExceptionDemo {

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(14);
        } catch (InvalidAgeException e) {
            System.out.println("Caught error: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}