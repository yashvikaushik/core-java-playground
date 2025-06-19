package callByValueOrReference;

public class CallByValue {

    int a;
    int b;
     public static void swap(int a,int b){
        int t=a;
        a=b;
        b=t;
        System.out.println("inside swap method: a= "+a+"b= "+b);
     }

     public static void main(String args[]){
        int a=4;
        int b=5;
        System.out.println("before swaping a= "+a+" b= "+b );
        swap(a,b);
        System.out.println("after swaping a= "+a+" b= "+b );
       

     }



    
    
}
