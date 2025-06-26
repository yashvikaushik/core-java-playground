package modifiedBankManagementSystem;

abstract public class Account {
  protected  String accountNumber;
  protected String accountHolderName;
  protected double balance;

  Account(String accountNumber,String accountHolderName,double balance){
    this.accountNumber=accountNumber;
    this.accountHolderName=accountHolderName;
    this.balance=balance;

  }

  abstract public void deposit(double amount);
  abstract public void withdraw(double amount);
  abstract public void displayDetails();

  public String getAccountNumber(){
    return accountNumber;

  }

  public String getAccountHolderName(){
    return accountHolderName;
  }

  public double getBalance()
{
    return balance;
} 

public void setAccountHolderName(String accountHolderName){
    this.accountHolderName=accountHolderName;

}

public void setBlanace(double balance){
    this.balance=balance;
}
}
