package generalExercise;

public class SuperMarketDiscountSystem {
    public static void main(String[] args) {
        RegularCustomer c1=new RegularCustomer("priya");
        RegularCustomer c2=new RegularCustomer("akansha");
        PremiumCustomer c3=new PremiumCustomer("abhinav");

        Customer customer[]={c1,c2,c3};
        for(int i=0;i<customer.length;i++){
            customer[i].getDiscount();
            
            System.out.println("--------------------------");
        }
    }
    
}
