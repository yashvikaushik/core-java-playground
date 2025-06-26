package modifiedBankManagementSystem;

public class CurrentAccount extends Account {

    private final double overdraft=5000.0;

    CurrentAccount(String accountNumber,String accountHolderName,double balance){
        super(accountNumber, accountHolderName, balance);
    }
    
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("amount should be positive");
        }
       
        
    }

    public void withdraw(double amount){
        if(amount>0 && amount<overdraft){
            balance-=amount;


        }

        else{
            System.out.println("overdraft limit exceeded");
        }


    }
    public void displayDetails(){

          System.out.println("name of the account holder : "+accountHolderName);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Current balance: "+this.balance);
        System.out.println("updated balance: "+balance);


    }
}
