package com.blabz;

import java.util.Random;
import java.util.Scanner;

public class GamblerUC2 {
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

        /*
            Using while case to check the gambler is win or loss
        */
        if (isPlayerWonTheGame()) {
            System.out.println("You won the game! Your profit is $1.");
        } else {
            System.out.println("You won the game! Your profit is $1.");
        }
    }
}

