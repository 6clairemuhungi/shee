package com.claire;

public class TestAccounts {
    public static void main(String[] args) {
        Account acc1 = new Account("Mary","001",3000);
        Account acc2 = new Account("Lucy","002",6000);
        Account acc3 = new Account("Isaac","003",4000);
        Account acc4 = new Account("Rita","004",8000);
        Account acc5 = new Account("Mercy","005",10000);

        System.out.println( acc1.getBalance() );
        acc1.setBalance(6500);
        System.out.println(acc1.getBalance() );

        acc2.deposit(1000);
        acc2.printDetails();
        acc2.withdraw(300);
        acc2.printDetails();

        String name= "John";
        name.toLowerCase();
        //primitive
        int x =10;
        double z=88;
        boolean finished=true;

        Account[] accounts ={ acc1, acc2, acc3, acc4, acc5};

        for(Account k : accounts)
        {
            k.deposit(100);
            k.printDetails();
        }


    }
}
