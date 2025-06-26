package Revision;

public class ShoppingCart {
    Products product1;
    Products product2;
    Products product3;
    double total;
     ShoppingCart(Products product1,Products product2,Products product3){
        this.product1=product1;
        this.product2=product2;
        this.product3=product3;
        this.total=0.0;

     }

     public void total(){
        total+=product1.getPrice()+product2.getPrice()+product3.getPrice();
        System.out.println("your total is: "+total);
     }

     public void displayCart(){
        Products arr[]={product1,product2,product3};
        for(int i=0;i<arr.length;i++){
            System.out.println("name of the product is: "+arr[i].getProductName());
            System.out.println("ID of the product is: "+arr[i].getProductID());
            System.out.println("price of the product is: "+arr[i].getPrice()+"Rs");
            System.out.println("----------------------------------------------");
            


        }
        System.out.println("name of the product is:");
     }
    
}
