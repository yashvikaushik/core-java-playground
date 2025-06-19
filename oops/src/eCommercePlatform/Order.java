
package eCommercePlatform;

public class Order {
    private long orderID;
    private double totalPrice;
    private Product product[];
    Customer customer;
    private int productCount;
    private static final int maxProducts=10;//constant value has been set that maximum of 10 products could only be set
     
    Order(long orderID,Customer customer){
        this.orderID=orderID;
        this.totalPrice=0.0;
        this.productCount=0;
        this.product=new Product[maxProducts];//array initialization
        this.customer=customer;
    }
    public long getOrderID(){
        return orderID;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public Product[] getProduct(){
        return product;
    }

    public Customer getCustomer(){
        return customer;
    }
    public int getProdcutCount(){
        return productCount;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice=totalPrice;
    }

    public void setProduct(Product product[]){
        this.product=product;
    }

    public void setCustomer(Customer customer){
        this.customer=customer;
    }

    public void displayOrderDetails(){
        System.out.println(".....order details.....");
        customer.displayCustomerDetails();
         System.out.println("total price of the cart "+totalPrice);
         System.out.println();
        if(productCount==0){
            System.out.println("your cart is empty");
        }
        else{
            for(int i=0;i<product.length;i++){
                 product[i].displayDetails();
                }
            
        }

       

        

    }

    public boolean addProducts(Product product){
        if(productCount<maxProducts){
           this.product[productCount]=product;
           productCount++;
           totalPrice+=product.getPrice();
           return true;
        }
        else{
            System.out.println("no more products could be added as you have reached the maximum limit of your cart");
            return false;
        }
        
    }
   
}
