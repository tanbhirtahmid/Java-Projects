package cse.ku.oop;

public class BankSystem {
private BankAccount account;
private Transaction transaction;

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

public void accountDetails(){
    System.out.println(this.account);
}

public void printStatement(){
    this.account.statement();
}

}
