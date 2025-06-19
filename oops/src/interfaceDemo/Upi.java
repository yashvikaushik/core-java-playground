package interfaceDemo;

public class Upi implements PyamentGateway{
    double amount;
    Upi( double amount){
        this.amount=amount;

    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public void pay(double amount){
        System.out.println("the amount paid via UPI is: "+amount);
        System.out.println("current amount: "+this.amount);//the amount entered in the cunstroctor

    }

    public void refund(double amount){
        System.out.println("the amount paid via UPI is: "+amount);


    }
    
}
