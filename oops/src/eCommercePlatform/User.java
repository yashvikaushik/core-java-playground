package eCommercePlatform;

public class User {
    protected String userID;
    protected String password;

     public User(String userID,String password){
        this.userID=userID;
        this.password=password;
    }

    public boolean login(String enteredUserID,String enteredPassword){
        if(this.userID.equals(enteredPassword)&&this.password.equals(enteredPassword)){
            System.out.println("user logged in successfully");
            return true;
        }
            else{
                System.out.println("invalid user ID or password");
                return false;
            }
        

    }

    public String getUserID(){
        return userID;

    }
    public String getPassword(){
        return password;

    }
    //setters are not required as such bcz passwords can generally not be set after creation
    /*public void setPassword(String password){
        this.password=password;

    }

    public void setUserID(String userID){
        this.userID=userID;

    }*/
    
}
