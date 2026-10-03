package cse.ku.oop;

public class Transaction {
    private String tid;
    private double amount;
    private String accountNumber;
    private String type;

    public Transaction(String number, String type, double amount){
        this.amount = amount;
        this.accountNumber = number;
        this.type = type;
        this.tid = "null";
    }

    public String getAccountNumber()
    {
        return this.accountNumber;
    }

    public String transactionDetails(){
        if(this.type == "withdraw")
        {
            return "\n--------------------------\n" + "Account Number: " + this.accountNumber + '\n' + "Type: " + this.type + "\nAmount: -" + this.amount + "\n--------------------------\n";
        }
        return "\n--------------------------\n" + "Account Number: " + this.accountNumber + '\n' + "Type: " + this.type + "\nAmount: +" + this.amount + "\n--------------------------\n";
    }
}
