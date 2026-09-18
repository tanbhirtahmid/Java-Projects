package cse.ku.oop;

public class Transaction {
    private String transactionId = "NULL";
    private String date = "Today";
    private String type;
    private double amount;
    private String accountNumber;

    public Transaction(String num){
        this.accountNumber = num;
    }

    public void setAcc(String accNum){
        this.accountNumber = accNum;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
    public String getTransactionDetails(){
        return "\nTransaction ID: " + this.transactionId + "\nAccount Number: " + this.accountNumber + "\nDate: " + this.date + "\nType: " + this.type + "\nAmount: " + this.amount;
    }
}
