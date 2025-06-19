package interfaceDemo;

public class Document implements Printable,Sendable{
    
    @Override
    public void print(){
        System.out.println("printable document");
    }

    @Override
    public void send(String message){
        System.out.println("message: "+message);
    }
    
}
