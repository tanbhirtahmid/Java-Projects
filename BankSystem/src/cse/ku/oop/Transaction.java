package cse.ku.oop;

import java.util.Random;

public class Transaction {
    private int tid;
    private double amount;
    private String accountNumber;
    private String type;

    public Transaction(String number, String type, double amount){
        Random rand = new Random();
        this.amount = amount;
        this.accountNumber = number;
        this.type = type;
        this.tid = rand.nextInt(10000, 99999);
    }

    public String getAccountNumber()
    {
        return this.accountNumber;
    }

    public String transactionDetails(){
        if(this.type == "withdraw")
        {
            return "\n--------------------------\n" + "Transaction ID: " + this.tid + '\n' + "Account Number: " + this.accountNumber + '\n' + "Type: " + this.type + "\nAmount: -" + this.amount + "\n--------------------------\n";
        }
        return "\n--------------------------\n" + "Transaction ID: " + this.tid + '\n' + "Account Number: " + this.accountNumber + '\n' + "Type: " + this.type + "\nAmount: +" + this.amount + "\n--------------------------\n";
    }
}
