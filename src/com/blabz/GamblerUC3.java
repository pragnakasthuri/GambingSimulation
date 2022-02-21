package com.blabz;

import java.util.Random;
import java.util.Scanner;

public class GamblerUC3 {
    /**
     * @return boolean
     */
    public static boolean isPlayerWonTheGame() {
        Random random = new Random();
        return random.nextInt(2) == 1;
    }

    public static void main(String[] args) {
        /**
        *Taking Scanner class to take input from user
        */
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the stake amount :");
        int stakeAmount = inputScanner.nextInt();

        System.out.println("Please enter the amount you want to bet for every game :");
        int betAmount = inputScanner.nextInt();
        inputScanner.close();

        /**
        *Using do while loop to calculate Gambler if won or lost 50% of the stake, would resign for the day
        */
        int profit = 0;
        int loss = 0;
        int fiftyPercentOfStakeAmount = stakeAmount / 2;
        do{
            if (isPlayerWonTheGame()) {
                profit++;
                if (profit == fiftyPercentOfStakeAmount) {
                    System.out.println("You are going to resign from the game as your profit reached 50%, i.e : "+profit);
                    break;
                }
            } else {
                loss++;
                if (loss == fiftyPercentOfStakeAmount) {
                    System.out.println("You are going to resign from the game as your loss reached 50%, i.e : "+loss);
                    break;
                }
            }
        }while (profit <= fiftyPercentOfStakeAmount || loss <= fiftyPercentOfStakeAmount);
    }
}
