package cse.ku.oop;

public class Main {
    public static void main(String[] args) {
//        Transaction nayemT, pretomT;
        Account nayem, pretom;
        nayem = new Account("260254", "Naim", "Current", 350);
        pretom = new Account("260267", "Pretom", "Current", 600);

        // Nayem Part
        nayem.deposit(20);

        // Pretom part
        pretom.withdraw(100);

        // both acc details
//        System.out.println(nayem.getAccountDetails());
//        System.out.println(pretom.getAccountDetails());

        System.out.println(nayem);
        System.out.println(pretom);


        }

}