package cse.ku.oop;

public class BankSystem {
private BankAccount account;
private Transaction transaction;
private BankAccount accountholders[]; //Account array for storing the bank accounts
private int currentIndex=0; //Pointer of accounts
public BankSystem(int numberOfAccounts)
{
    this.accountholders = new BankAccount[numberOfAccounts];
}

public void addAccount(String number, String name, double initBalance){
    BankAccount account = new BankAccount(number, name, initBalance);
    this.accountholders[currentIndex] = account; //Adding account object to array
    this.currentIndex++; //Increment the pointer
}

public BankAccount searchAccount(String number){
    for(BankAccount accnt: this.accountholders){
        if(accnt.getAccountNumber().equals(number)) {
            return accnt; //If found return the account object
        }
    }
    return null; //If account not found
}

public int getNumberOfCustomers(){
    return this.currentIndex;
}

public void createAccount(BankAccount account)
{
    this.account = account;
    System.out.println("Created account");
}

public void deleteAccount(String accountNumber)
{
    System.out.println("Delete account");

}

public void performtransaction(String number, double amount)
{

    this.account.deposit(amount);
}

public void performDeposit(double amount){
    this.account.deposit(amount);
}

public void performWithdraw(double amount){
        this.account.withdraw(amount);
}

public void printStatement(){
    this.account.statement();
}

public void accountDetails(){
        System.out.println(this.account);
    }

}
