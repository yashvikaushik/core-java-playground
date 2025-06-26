package modifiedBankManagementSystem;

public class Bank {
    private Account accounts[];
    private int accountCount;
    SavingsAccount savingsAccount;
    
    Bank(){
        this.accountCount=0;
        accounts=new Account[100];

    }

    public boolean addAccount(Account account){
        if(accountCount<100){
            accounts[accountCount]=account;
            accountCount++;
            return true;
            

        }
        else{
            System.out.println("no more accounts can be created");
            return false;
        }
    }

    public Account findAccount(String accountNum){
       for(int i=0;i<=accountCount;i++)
{
    if(accounts[i].getAccountNumber().equals(accountNum)){
        return accounts[i];
    }

   
}
 return null;
    }

     public void displayAllAccounts() {
        for (int i = 0; i < accountCount; i++) {
            accounts[i].displayDetails();
            System.out.println("-----------------------------");
        }
    }

    public Account[] getAccounts(){
        
        return accounts;
   
    }
    
}
