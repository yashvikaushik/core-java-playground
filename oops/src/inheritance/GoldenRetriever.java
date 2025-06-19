package inheritance;

public class GoldenRetriever extends Dog{
   private String toy;

   GoldenRetriever(String name,int age,String breed,String toy){
    super(name,age,breed);
    System.out.println("constructor of golden retriever class called");
    this.toy=toy;

   }

   @Override
   public void makeSound(){
    System.out.println("ball");
   }

   public String getToy(){
    return toy;
   }

    
}
