package staticfields;


public class StaticExampleDemo {
    public static void main(String[] args) {
        final float PI=3.14f;//final cannot be reassigned

    StaticExample example1=new StaticExample();
    System.out.println(example1);
    example1.instanceCount=5;
    System.out.println(example1);


    StaticExample example2=new StaticExample();
    System.out.println(example2);

     StaticExample.staticCount=25;

}

    
}
