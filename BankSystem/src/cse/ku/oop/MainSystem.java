package cse.ku.oop;

public class MainSystem {

    public static void main(String args[]){
        BankSystem banksys = new BankSystem(10, 10); //Maximum 10 accounts

        // keep info about two acc
        banksys.addAccount("00011", "Jhon", 10000);
        banksys.addAccount("00022", "Bob", 250);


        //print info
        banksys.accountDetails("00011");
        banksys.accountDetails("00022");



        BankAccount baccnt = banksys.searchAccount("00022");

        if(baccnt==null){
            System.out.println("Customer not found");
        }
        else{
            System.out.println("Found the customer>>"+baccnt);
        }


        // delete account
        banksys.deleteAccount(baccnt.getAccountNumber());

        //verify
        banksys.listAccounts();

        // transaction for Bob
//        banksys.performtransaction("00022", "deposit", 10000);
//        banksys.performtransaction("00022", "withdraw", 300);
//        banksys.performtransaction("00022", "withdraw", 5000);

        //transaction for john
        banksys.performtransaction("00011", "deposit", 100);
        banksys.performtransaction("00011", "deposit", 300);
        banksys.performtransaction("00011", "withdraw", 50);

        // listing transaction
        banksys.listTransaction("00011");

        // printing account statement
        banksys.printStatement("00044");




    }
}
