package com.blabz;

import java.util.Scanner;

public class GamblerUC1 {
    public static void main(String[] args) {
    /*
    Taking Scanner class to take input from user
     */
        Scanner inputScanner = new Scanner(System.in);
        /*
        Taking two values stake Amount and bet amount from user
        and storing in stakeAmount and betAmount as int value
         */
        System.out.println("Please enter the stake amount :");
        int stakeAmount = inputScanner.nextInt();

        System.out.println("Please enter the amount you want to bet for every game :");
        int betAmount = inputScanner.nextInt();
    }
}


