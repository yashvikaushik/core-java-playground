

import java.util.*;
public class ATM {
   /*static*/ String name;
  /*static*/  double balance;
   /*static*/ long PIN;
    /*static*/ int accountNumber;
 public /*static*/ void menu(Scanner sc){
    System.out.println("WELCOME TO THE VIRTUAL ATM");
    System.out.println("Here is the menu of operations that you might want to perform");
    System.out.println("1. Account details - to check the user's account details");
    System.out.println("2. Check Balance - to check the current account balance");
    System.out.println("3. Deposit - to deposit money and check the new account balance");
    System.out.println("4. Withdraw - to withdraw money and check the remaining balance ");
    System.out.println("5. Exit - to exit the virtual ATM");
    System.out.println("choose the task that you want to perform");
    int choice=sc.nextInt();
    switch (choice){
        case 1:
        System.out.println("the service chosen by you is to access your account details");
        accountDetails(sc);
        break;

         case 2:
          System.out.println("the service chosen by you is to check balance in your account");
          checkBalance();
          break;

         case 3:
          System.out.println("the service chosen by you is to deposit money in your account");
          deposit(sc);
          break;

         case 4:
          System.out.println("the service chosen by you is to withdraw money from your account");
          withdraw(sc);
          break;

          default:
           System.out.println("the service chosen by you is invalid ");
          break;
    }


 }
    public /*static*/ void checkBalance(){
        System.out.println("Your current balance is: "+balance);
    }
    public /*static*/ void input(Scanner sc){
        System.out.println("Enter you name");
        sc.nextLine();
        name=sc.nextLine();
        System.out.println("Enter you balance");
        balance=sc.nextDouble();

    }
    public /*static*/ void accountDetails(Scanner sc){
        System.out.println("name of the account holder: "+name);
        System.out.println("Account number of the account holder is: "+accountNumber);
        checkBalance();//to show the balance amount 
    }
    public /*static*/ void deposit(Scanner sc){
        System.out.println("Enter the amount that has to be deposited:");
         double money=sc.nextInt();
        balance=balance+money;
        checkBalance();
    }

    public /*static*/ void withdraw(Scanner sc){
        System.out.println("Enter the amount that you want to withdraw");
         double money=sc.nextInt();
        balance=balance-money;
        if(balance<1500.0){
            System.out.println("your account fails to maintain minimum amount, please enter a valid account or else your account would be deleted permanantly");
        }
        else{
            System.out.println("your new balance after withdrawing the money is :");
            checkBalance();
        }
    }
    public static void exit(){
        System.out.println("Thank you for visiting our Virtual ATM , hope you liked our services ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char choice;
        ATM obj=new ATM();
        do{
            obj.input(sc);
            obj.menu(sc);
            System.out.println("Do you want to continue enter y for yes and n for no");
            choice=sc.next().charAt(0);
        }
        while(choice=='y');
    }
}

    

