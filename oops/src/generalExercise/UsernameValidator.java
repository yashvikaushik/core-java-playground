package generalExercise;

public class UsernameValidator {
    public static void main(String[] args) {
        UserName username=new UserName();
        try{
            username.Username("priyanshi");
            System.out.println("username is valid");
        }
        catch(SpacesException e){
            System.out.println(e.getMessage());
        }
        catch(MinimumCharactersException e){
            System.out.println(e.getMessage());
        }
    }

    
}
