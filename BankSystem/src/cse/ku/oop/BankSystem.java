package cse.ku.oop;
import java.util.ArrayList;

public class BankSystem {
//private BankAccount account;
private ArrayList<Transaction> transaction;
private ArrayList<BankAccount> accountholders; //Account array for storing the bank accounts
private int delCount = 0; // delete count

public BankSystem(int numberOfAccounts, int numberOfTransactions)
{
    this.accountholders = new ArrayList<BankAccount>(numberOfAccounts);
    this.transaction = new ArrayList<Transaction>(numberOfTransactions);
}

// transaction methods start

public void addTransaction(String number, String type, double amount){ // managing transaction
    Transaction transac = new Transaction(number, type, amount);
    this.transaction.add(transac);
//    this.transactionCnt++;
}

public void listAccounts(){
    if(accountholders.isEmpty()){
        System.out.println("No accounts in the list");
        return;
    }
    System.out.println('\n' + "List of accounts: ");
    for(int i =0 ; i<accountholders.size(); i++)
    {
        System.out.println(this.accountholders.get(i).toString());
    }
}

public int getNumberOfTransactions()
{
    return this.transaction.size();
}

public void listTransaction(String number)
{
    boolean notFound = true;
    for(int i = 0; i < this.transaction.size(); i++)
    {
        if(this.transaction.get(i).getAccountNumber().equals(number))
        {
            System.out.println(this.transaction.get(i).transactionDetails());
            notFound = false;
        }
    }

    if(notFound)
    {
        System.out.println("No transactions found for " + number);
    }

}

    public void performtransaction(String number, String type, double amount)
    {
        BankAccount acc = searchAccount(number);
        if(acc == null)
        {
            System.out.println("Account " + number + " not found");
            return;
        }
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
    BankAccount account = searchAccount(number);
    if(account == null){
        account = new BankAccount(number, name, initBalance);
    this.accountholders.add(account); //Adding account object to array
//    this.currentIndex++; //Increment the pointer
    }
}

    public BankAccount searchAccount(String number){
    for(int i = 0; i < accountholders.size(); i++){
        if(this.accountholders.get(i).getAccountNumber().equals(number)) {
            return this.accountholders.get(i); //If found return the account object
        }
    }
    return null; //If account not found
}

public int getNumberOfCustomers(){
    return this.accountholders.size();
}

//public void createAccount(BankAccount account)
//{
//    this.account = account;
//    System.out.println("Created account");
//}

    public void deleteAccount(String accountNumber)
    {
        for(int i = 0; i < accountholders.size(); i++){
            if(this.accountholders.get(i).getAccountNumber().equals(accountNumber))
            {
                this.accountholders.remove(i);
                System.out.println("Deleted " + accountNumber);
                this.delCount++;
                return;
            }
        }

        System.out.println(accountNumber + " does not exist");

    }

    public int getDelCount() { // get the number of account deleted
        return delCount;
    }


    public void printStatement(String number){

    BankAccount acc = searchAccount(number);
    if(acc != null)
    {
        acc.statement();
    }
    else
    {
        System.out.println("Account " + number + " does not exist");
    }
    }

    public void accountDetails(String number){

    BankAccount acc = searchAccount(number);
    if(acc != null)
    {
    System.out.println(acc);
    }
    else
    {
    System.out.println("Account " + number + " does not exist");
    }

}

}
