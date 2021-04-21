package com.company;

import java.util.Scanner;

public class LoginOper implements Login {
    Scanner scn = new Scanner(System.in);
    String userName, name = "namal";
    int password, pw = 1234;

    @Override
    public void start() {
        System.out.println("====================================");
        System.out.println("|      Welcome To ATM Services     |");
        System.out.println("------------------------------------");
        System.out.print("    User Name : ");
        userName = scn.nextLine();
        System.out.print("    Pass Word : ");
        password = scn.nextInt();

    }

    @Override
    public boolean CheckInput() {
        if (userName.equals(name) && (password == pw)) {
            return true;
        } else {
            return false;
        }
    }
}