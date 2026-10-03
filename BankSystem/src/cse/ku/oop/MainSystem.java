package cse.ku.oop;

public class MainSystem {

    public static void main(String args[]){
        BankSystem banksys = new BankSystem(10, 10); //Maximum 10 accounts


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

        banksys.printStatement("00022");

        banksys.performtransaction("00022", "deposit", 10000);

        banksys.performtransaction("00022", "withdraw", 5000);


        banksys.listTransaction("00022");

        banksys.printStatement("00022");
//        if(banksys.searchAccount("00022") !=null) System.out.println("fount it");
        banksys.deleteAccount(baccnt.getAccountNumber());
        System.out.println(banksys.getDelCount());



    }
}
