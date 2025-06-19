package inheritance;

public class User {
   private String name;
  private  String userID;

  User(String name,String userID){
    this.name=name;
    this.userID=userID;
    System.out.println("constructor of parent class that is User");

  }

  public void displayInfo(){
    System.out.println("name: "+name);
    System.out.println("user ID: "+userID);
  }
  public String getName(){
    return name;
}
public String getUserID(){
    return userID;
}

public void setName(String name){
    this.name=name;
}
public void setUserID(String userID){
    this.userID=userID;
}
    
}
