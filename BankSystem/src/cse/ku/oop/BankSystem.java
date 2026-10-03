package cse.ku.oop;

public class BankSystem {
private BankAccount account;
private Transaction transaction;
private BankAccount accountholders[]; //Account array for storing the bank accounts
private int currentIndex=0;
private int delCount = 0;//delte cound


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
    for(int i = 0; i < currentIndex; i++){
        if(this.accountholders[i].getAccountNumber().equals(accountNumber))
        {
            this.accountholders[i] = null;
            System.out.println("Deleted " + accountNumber);
            for(int j = i; j < currentIndex-1; j++)
            {
                this.accountholders[j] = this.accountholders[j+1];
            }
            this.accountholders[currentIndex] = null;
            currentIndex--;
            this.delCount++;
            return;
        }
    }

    System.out.println(accountNumber + " does not exist");

}

    public int getDelCount() { // get the number of account deleted
        return delCount;
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
