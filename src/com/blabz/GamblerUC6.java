package com.blabz;

import java.util.Random;
import java.util.Scanner;

public class GamblerUC6 {
    /**
     * @return boolean true if won
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
         *Using while loop to calculate Gambler if won or lost 50% of the stake, would resign for the day
         */
        int initialAmount = stakeAmount;
        int profitableDays = 0;
        int lossDays = 0;
        int maxProfit = 0;
        int maxProfitDay = 0;
        int maxLoss = 0;
        int maxLossDay = 0;
        for (int i = 1; i <= 20; i++) {
            int profit = 0;
            int loss = 0;
            int fiftyPercentOfStakeAmount = stakeAmount / 2;
            do {
                if (isPlayerWonTheGame()) {
                    profit++;
                    if (profit == fiftyPercentOfStakeAmount) {
                        profitableDays++;
                        stakeAmount+=profit;
                        if (profit > maxProfit) {
                            maxProfit = profit;
                            maxProfitDay = i;
                        }
                        System.out.println("Everyday profit :" +profit);
                        break;
                    }
                } else {
                    loss++;
                    if (loss == fiftyPercentOfStakeAmount) {
                        lossDays++;
                        stakeAmount-=loss;
                        if (loss > maxLoss) {
                            maxLoss = loss;
                            maxLossDay = i;
                        }
                        System.out.println("Everyday loss :" +loss);
                        break;
                    }
                }
            } while (profit <= fiftyPercentOfStakeAmount || loss <= fiftyPercentOfStakeAmount);
        }
        System.out.println("Total profitable days: "+profitableDays);
        System.out.println("Total loss days: "+lossDays);
        System.out.println("Total Profit/loss after 20 days is :" +(stakeAmount - initialAmount));
        System.out.println("Luckiest day: "+ maxProfitDay+", and Profit is: "+maxProfit);
        System.out.println("Bad day: "+ maxLossDay+", and Loss is: "+maxLoss);
    }
}
