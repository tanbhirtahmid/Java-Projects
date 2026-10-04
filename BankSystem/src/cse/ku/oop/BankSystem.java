package cse.ku.oop;

public class BankSystem {
//private BankAccount account;
private Transaction transaction[];
private BankAccount accountholders[]; //Account array for storing the bank accounts
private int currentIndex=0;
private int delCount = 0; // delete count
private int transactionCnt = 0;//transaction count

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

public void listAccounts(){
    if(currentIndex==0){
        System.out.println("No accounts in the list");
        return;
    }
    System.out.println('\n' + "List of accounts: ");
    for(int i =0 ; i<currentIndex; i++)
    {
        System.out.println(this.accountholders[i].toString());
    }
}

public int getNumberOfTransactions()
{
    return this.transactionCnt;
}

public void listTransaction(String number)
{
    boolean notFound = true;
    for(int i = 0; i < this.transactionCnt; i++)
    {
        if(this.transaction[i].getAccountNumber().equals(number))
        {
            System.out.println(this.transaction[i].transactionDetails());
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
    this.accountholders[currentIndex] = account; //Adding account object to array
    this.currentIndex++; //Increment the pointer
    }
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

//public void createAccount(BankAccount account)
//{
//    this.account = account;
//    System.out.println("Created account");
//}

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
