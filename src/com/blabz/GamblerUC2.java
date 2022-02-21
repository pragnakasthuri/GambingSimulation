package com.blabz;

import java.util.Random;
import java.util.Scanner;

public class GamblerUC2 {

    /**
     * @return boolean
     */
    public static boolean isPlayerWonTheGame() {
        Random random = new Random();
        return random.nextInt(2) == 1;
    }

    public static void main(String[] args) {
        /**
        Taking Scanner class to take input from user
        */
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter the stake amount :");
        int stakeAmount = inputScanner.nextInt();

        System.out.println("Please enter the amount you want to bet for every game :");
        int betAmount = inputScanner.nextInt();
        inputScanner.close();

        /**
            Using while loop to check the gambler is won or loss
        */
        if (isPlayerWonTheGame()) {
            System.out.println("You won the game! Your profit is $1.");
        } else {
            System.out.println("You lost the game! Your loss is $1.");
        }
    }
}

