package inheritance;

public class Teacher extends User {
   private String subject;
    Teacher(String name,String userID,String subject){
        super(name,userID);
        System.out.println("constructor of Teacher class");
        this.subject=subject;
    }


        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("subject: "+subject);
        }
        public String gaetSubject(){
            return subject;
        }

        public void getSubject(String subject){
            this.subject=subject;
        }


    
    
}
