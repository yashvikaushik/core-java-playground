package modifiedBankManagementSystem;

public  class SavingsAccount extends Account {

    private final double interestRate=0.03;

    SavingsAccount(String accountNumber,String accountHolderName,double balance){
        super(accountNumber, accountHolderName, balance);
    }

    public void deposit(double amount){
        if(amount>0){
            calculateInterest();
            balance+=amount;
            System.out.println("deposited successfully");
        }
        else{
            System.out.println("deposit amount must be positive");
        }

    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("witdhraw successfull");
        }

        else{
            System.out.println("insufficient balance");
        }


    }

    public void displayDetails(){
        System.out.println("name of the account holder : "+accountHolderName);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Current balance: "+this.balance);
        System.out.println("updated balance: "+balance);

    }

    public void calculateInterest(){
        double interest=0.03*balance;
        balance+=interest;
    }
    
}
