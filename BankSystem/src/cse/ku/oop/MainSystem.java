package cse.ku.oop;

public class MainSystem {

    public static void main(String args[]){
        BankSystem banksys = new BankSystem(10); //Maximum 10 accounts
        banksys.addAccount("00011", "Jhon", 100);
        banksys.addAccount("00022", "Bob", 250);
        System.out.println("Number of customers in the bank: "+ banksys.getNumberOfCustomers());
        BankAccount baccnt = banksys.searchAccount("00022");
        if(baccnt==null){
            System.out.println("Customer not found");
        }
        else{
            System.out.println("Found the customer>>"+baccnt);
        }
        banksys.deleteAccount(baccnt.getAccountNumber());
        System.out.println(banksys.getDelCount());
        if(banksys.searchAccount(baccnt.getAccountNumber()) !=null) System.out.println("fount it");

//        BankAccount baccount1 = new BankAccount("00011", "Bob", 100);
//        banksys.createAccount(baccount1);
//        banksys.accountDetails();
////        banksys.performtransaction("0011", 1000.0);
//        banksys.performDeposit(500);
//        banksys.printStatement();
//        banksys.performWithdraw(250);
//        banksys.printStatement();
////        banksys.deleteAccount("1");

    }
}
