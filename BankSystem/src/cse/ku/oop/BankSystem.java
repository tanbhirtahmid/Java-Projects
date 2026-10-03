package cse.ku.oop;

public class BankSystem {
private BankAccount account;
private Transaction transaction[];
private BankAccount accountholders[]; //Account array for storing the bank accounts
private int currentIndex=0;
private int delCount = 0; // delete count
private int transactionCnt = 0;//transaction count

// constructor
public BankSystem(int numberOfAccounts, int numberOfTransactions)
{
    this.accountholders = new BankAccount[numberOfAccounts];
    this.transaction = new Transaction[numberOfTransactions];
}

// transaction methods start

public void addTransaction(String number, String type, double amount){ // managing transaction
    Transaction transac = new Transaction(number, type, amount);
    this.transaction[transactionCnt] = transac;
    this.transactionCnt++;
}

public int getNumberOfTransactions()
{
    return this.transactionCnt;
}

public void listTransaction(String number)
{
    for(int i = 0; i < this.transactionCnt; i++)
    {
        if(this.transaction[i].getAccountNumber().equals(number))
        {
            System.out.println(this.transaction[i].transactionDetails());
        }
    }

}

    public void performtransaction(String number, String type, double amount)
    {
        BankAccount acc = searchAccount(number);
        if (type == "deposit")
        {
            acc.deposit(amount);
            addTransaction(number, "deposit", amount);
        }
        else if(type == "withdraw")
        {
            acc.withdraw(amount);
            addTransaction(number, "withdraw", amount);
        }

    }

// normal account methods start

    public void addAccount(String number, String name, double initBalance){
    BankAccount account = new BankAccount(number, name, initBalance);
    this.accountholders[currentIndex] = account; //Adding account object to array
    this.currentIndex++; //Increment the pointer
}

public BankAccount searchAccount(String number){
    for(int i = 0; i < currentIndex; i++){
        if(this.accountholders[i].getAccountNumber().equals(number)) {
            return this.accountholders[i]; //If found return the account object
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

//private void performDeposit(double amount){
//    this.account.deposit(amount);
//
//}
//
//private void performWithdraw(double amount){
//
//    this.account.withdraw(amount);
//}

public void printStatement(String number){

    BankAccount acc = searchAccount(number);
    acc.statement();
}

public void accountDetails(String number){

    BankAccount acc = searchAccount(number);
    System.out.println(acc);
    }

}
