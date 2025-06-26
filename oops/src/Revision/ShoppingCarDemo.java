package Revision;

public class ShoppingCarDemo {
    public static void main(String[] args) {
        Products p1=new Products("chips","100",20);
        Products p2=new Products("chocolate","101",45);
        Products p3=new Products("juice","102",100);

        ShoppingCart shoppingCart=new ShoppingCart(p1, p2, p3);
        shoppingCart.displayCart();
        shoppingCart.total();

    }
    
}
