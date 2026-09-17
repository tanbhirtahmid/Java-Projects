package cse.ku.oop;

public class Main {
    public static void main(String[] args) {
//        Transaction nayemT, pretomT;
        Account nayem, pretom;
        nayem = new Account();
        pretom = new Account();

        // Nayem Part
        nayem.setNumber("260254");
        nayem.setUserName("Naim");
        nayem.setType("Current");
        nayem.setBalance(100);
        nayem.deposit(20);

        // Pretom part
        pretom.setNumber("260267");
        pretom.setUserName("Pretom");
        pretom.setType("Current");
        pretom.setBalance(500);
        pretom.withdraw(100);

        // both acc details
        System.out.println(nayem.getAccountDetails());
        System.out.println(pretom.getAccountDetails());


        }

}