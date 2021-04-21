package com.company;

import java.util.Scanner;

public class OptionDisplay implements Options{
    Scanner scn = new Scanner(System.in);
    public int choice;
    private int balance = 45000, amount;
    @Override
    public int choice() {
        System.out.println("---Choose one of the following---");
        System.out.println("|       1. View Balance         |");
        System.out.println("|       2. Deposits             |");
        System.out.println("|       3. Withdrawal           |");
        System.out.print("= Your choice : ");
        choice = scn.nextInt();
        return choice;

    }

    @Override
    public void viewBalance() {
        System.out.print("== Your Balance is -: " + balance);

    }

    @Override
    public void deposit() {
        System.out.print("== Enter Your Deposit Amount -: ");
        amount = scn.nextInt();
        balance = balance + amount;
        System.out.println("== Your Available Balance : "+balance);
    }

    @Override
    public void withdrawal() {
        System.out.print("== Enter Your Deposit Amount -: ");
        amount = scn.nextInt();
        if (amount<balance){
            balance = balance - amount;
            System.out.println("== Your Available Balance : "+ balance);
        }
        else {
            System.out.println("Your Balance is Not enough !!!");
        }

    }
}
