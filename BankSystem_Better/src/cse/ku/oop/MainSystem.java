package cse.ku.oop;

public class MainSystem {

    public static void main(String args[]){
        BankSystem banksys = new BankSystem();
        BankAccount baccount1 = new BankAccount("00011", "Bob", 100);
        banksys.createAccount(baccount1);
        banksys.accountDetails();
//        banksys.performtransaction("0011", 1000.0);
        banksys.performDeposit(500);
        banksys.printStatement();
        banksys.performWithdraw(250);
        banksys.printStatement();
//        banksys.deleteAccount("1");

    }
}
