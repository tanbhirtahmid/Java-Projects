package cse.ku.oop;

public class Account {
    private String accountnumber;
    private String userName;
    private String accounttype;
    private double balance;
    private Transaction transaction = new Transaction();

    public Account(String num, String name, String type, double balance){
        this.accountnumber = num;
        this.userName = name;
        this.accounttype = type;
        this.balance = balance;
        this.transaction.setAcc(num);
    }

    public String getTransactionDetails(){
        return this.transaction.getTransactionDetails();
    }

    public void setNumber(String number)
    {
        this.accountnumber = number;
        this.transaction.setAcc(number);
    }

    public String getNumber(){
        return this.accountnumber;
    }

    public void setUserName(String name){
        this.userName = name;
    }
     public String getUserName(){
        return this.userName;
     }

     public void setType(String type){
        this.accounttype = type;
     }

     public  String getType(){
        return this.accounttype;
     }

     public void setBalance(double balance){
        this.balance = balance;
     }

     public void deposit(double amount){

        this.balance = this.balance + amount;
         this.transaction.setType("deposit");
         this.transaction.setAmount(amount);
         System.out.println(this.getTransactionDetails());
     }

     public boolean withdraw(double amount){
        if(this.balance>=amount) {
            this.balance = this.balance - amount;
            this.transaction.setType("withdraw");
            this.transaction.setAmount(amount);
            System.out.println(this.getTransactionDetails());
            return true;
        }
        else return false;
     }

     public String toString(){

        return "\nAccount Number: "+ this.accountnumber + " | Name: " + this.userName + " | Type: " + this.accounttype + " | Balance: "+ this.balance;
     }
}
