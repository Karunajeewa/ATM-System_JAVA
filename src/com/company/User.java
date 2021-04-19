package com.company;

public class User implements Operation,Account{

    @Override
    public void viewBalance() {
        System.out.println(" Balance : "+ balance);
    }

    @Override
    public void deposit(double balance, double amount) {
        System.out.println(" Balance : "+ (balance+amount));
    }

    @Override
    public void withdrawal(double balance, double amount) {
        if(balance > amount){
            System.out.println(" Balance : "+ (balance-amount));
        }
        else if (balance == amount){
            System.out.println(" Balance : 0000 ");
        }
        else {
            System.out.println(" Invalid amount!!! , Your Balance : " + balance);
        }
    }
}
