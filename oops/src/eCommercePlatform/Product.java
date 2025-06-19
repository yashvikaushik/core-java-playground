package eCommercePlatform;

public class Product {
   private long productID;
  private  String productName;
  private  double price;

  Product(long productID,String productName,double price){
    this.productID=productID;
    this.productName=productName;
    this.price=price;
}

  
  public long getProductID(){
    return productID;

  }
  public String getProductName(){
    return productName;

  }
  public double getPrice(){
    return price;

  }

  public void setProductID(long productID){
    this.productID=productID;

  }
  public void setProductName(String productName){
    this.productName=productName;

  }
  public void setPrice(double price){
    this.price=price;

  }

  public void displayDetails(){
    System.out.println("product ID: "+productID);
    System.out.println("product name: "+productName);
    System.out.println("product price: "+price);
  }
}

