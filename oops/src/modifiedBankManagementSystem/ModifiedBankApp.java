package modifiedBankManagementSystem;
import java.util.*;
public class ModifiedBankApp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank bank=new Bank();
        int choice;
        String accountType;
         double amount;
         SavingsAccount savingsAccount=null;
            CurrentAccount currentAccount=null;

        do{
            System.out.println("===== Welcome to Java Bank System =====");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            

            switch(choice){

                case 1:
                System.out.println("enter the name of the account holder");
                String accountHolderName=sc.next();
                System.out.println("enter the account number");
                String accountNumber=sc.next();
                System.out.println("enter the current balance");
                double balance=sc.nextDouble();
                System.out.println("enter the type of you want to create");
                accountType=sc.next();
                if(accountType.equalsIgnoreCase("savings")){
               savingsAccount=new SavingsAccount(accountNumber, accountHolderName, balance);
               bank.addAccount(savingsAccount);
                }
               else{
               currentAccount=new CurrentAccount(accountNumber, accountHolderName, balance);
               bank.addAccount(currentAccount);
               }


               System.out.println("account created successfully");
               

               break;

               case 2: 
               System.out.println("enter the amount that you want to deposit");
               amount =sc.nextInt();
               System.out.println("enter your account number");
               String accNum=sc.next();
               Account acc=bank.findAccount(accNum);
               System.out.println("finding your account: ");
               if(acc!=null){
               System.out.println("Account found");
               acc.deposit(amount);
               }
               else{
                  System.out.println("account not found");
               }
               break;

               case 3:
               System.out.println("enter the amount that you want to deposit");
               amount =sc.nextInt();
               System.out.println("enter your account number");
               String accNumber=sc.next();
               Account account=bank.findAccount(accNumber);
               System.out.println("finding your account: ");
               if(account!=null){
               System.out.println("Account found");
               account.deposit(amount);
               }
               else{
                  System.out.println("account not found");
               }
               break;

               case 4:
              
              
                bank.displayAllAccounts();
                
              
            
               break;

               case 5:
               System.out.println("you have been exited successfully");
               break;

               default:
               System.out.println("wrong choice");





            }

        }
        while(choice!=5);

    }
    
}
