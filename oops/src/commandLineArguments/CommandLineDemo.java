package commandLineArguments;

public class CommandLineDemo {
    public static void main(String args[]){
        System.out.println("the length of args: "+args.length);
        System.out.println("the arguments are: ");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    
}
