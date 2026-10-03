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

    public String transactionDetails(){

        return "Dummy";
    }
}
