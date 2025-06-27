package generalExercise;

public class UserName {
    public void Username(String name) throws MinimumCharactersException,SpacesException {

        if(name.length()<=6){
            throw new MinimumCharactersException("minimum 6 charcters must be present in the username");
        }
        else {
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch!=32){
                throw new SpacesException("spaces are not allowed in the username");
            }

        }
    }
        


    }
    
}
