package com.company;

import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int pin = scn.nextInt();

        User myUser = new User();
        if((name.equals(Account.userName) )&& (pin == Account.pinNumber)){
            System.out.println(" -- OPTION MENU --");
            System.out.println("=View Balance - Press 1 ");
            System.out.println("=Deposit - Press 2 ");
            System.out.println("=Withdrawal - Press 3 ");
            int choice = scn.nextInt();

            switch (choice){
                case 1:
                    myUser.viewBalance();
                    break;
                case 2:
                    System.out.println("Enter Your Deposit Amount :");
                    myUser.deposit(Account.balance,scn.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter Your Withdrawal Amount :");
                    myUser.withdrawal(Account.balance,scn.nextDouble());
            }
        }
    }
}
