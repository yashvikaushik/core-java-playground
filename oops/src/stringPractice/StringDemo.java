package stringPractice;

public class StringDemo {
    public static void main(String args[]){
        String str1="Hello";
        String str2="World";
        String str3=new String("String 3 hai ye");
        System.out.println(str3);
        String str4=str1+" "+str3;
        String str5="string"+6;
        System.out.println(str5);

        String name1="John";
        String name2="John";
        String name3=new String("John");
        String name4="john";
        System.out.println("Equals 1: "+ (name1.equals(name2)));
        System.out.println("Equals 2: "+(name1.equals(name3)));
        System.out.println("Equals 2: "+(name1.equalsIgnoreCase(name4)));
        System.out.println("Equals 2: "+(name1.equals(name4)));

        //== operator is used to compare the reference of the objects
        System.out.println("==: "+(name1==name2)); 
        System.out.println("==: "+(name1==name3));

    }
    
}
