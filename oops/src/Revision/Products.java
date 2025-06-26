package Revision;

public class Products {

   private String name;
   private String productID;
   private double price;

   Products(String name,String productID,double price){
    this.name=name;
    this.productID=productID;
    this.price=price;
   }

   public String getProductName(){
    return name;
   }

   public String getProductID(){
    return productID;
   }
  
   public double getPrice(){
   return price;
   }

   public void setProductName(String name){
    this.name=name;
   }

   public void setProductID(String productID){
    this.productID=productID;
   }

   public void setPrice(double price){
    this.price=price;
   }
    
}
