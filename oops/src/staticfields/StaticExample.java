package staticfields;

public class StaticExample {
    int instanceCount=0;
    static int staticCount=0;

    static{
        System.out.println("static block executed");
    }

    StaticExample(){
        System.out.println("constructor executed");
        instanceCount++;
        staticCount++;
    }

    public String toString(){
        return"instance count= "+instanceCount+" static count= "+staticCount;
    }


    
}
