package com.blabz;

import java.util.Random;
import java.util.Scanner;

public class GamblerUC4 {
    /*
        Writing randomNumber() method to give random number using Random class
    */
    public static boolean isPlayerWonTheGame() {
        Random random = new Random();
        return random.nextInt(2) == 1;
    }

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
        inputScanner.close();

        /*
            Using while loop to calculate Gambler if won or lost 50% of the stake, would resign for the day
         */
        int totalAmount = stakeAmount;
        for (int i = 0; i <= 20; i++) {
            int profit = 0;
            int loss = 0;
            int fiftyPercentOfStakeAmount = stakeAmount / 2;
            do {
                if (isPlayerWonTheGame()) {
                    profit++;
                    if (profit == fiftyPercentOfStakeAmount) {
                        stakeAmount+=profit;
                        break;
                    }
                } else {
                    loss++;
                    if (loss == fiftyPercentOfStakeAmount) {
                        stakeAmount-=loss;
                        break;
                    }
                }
            } while (profit <= fiftyPercentOfStakeAmount || loss <= fiftyPercentOfStakeAmount);
        }
        System.out.println("Total Profit/loss after 20 days is :" +(stakeAmount - totalAmount));
    }
}
