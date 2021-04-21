package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Login newLog = new LoginOper();
        newLog.start();
        newLog.CheckInput();
        if(newLog.CheckInput()==true){
            Options newOpr = new OptionDisplay();

            switch (newOpr.choice()){
                case 1:
                    newOpr.viewBalance();
                    break;
                case 2:
                    newOpr.deposit();
                    break;
                case 3:
                    newOpr.withdrawal();
                    break;
                default:
                    System.out.println("Your Choice  Is Invalid !!!");
                    break;
            }
        }
        else {
            System.out.println("Your Login Details Is Invalid !!!");
        }
    }
}
