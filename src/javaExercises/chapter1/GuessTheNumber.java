package javaExercises.chapter1;

import utils.Utils;

import java.util.Scanner;

public class GuessTheNumber {

    static int secretNumber = 6;

    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("See if you can guess my number!");
        guessMyNumber();
    }

    public static void guessMyNumber() {
        do {
            System.out.println("Enter your guess (a number between 1 to 10): ");
            int guess = Utils.scanner().nextInt();

            if (guess == secretNumber) {
                System.out.println("Correct! The guessed number was " + secretNumber + ".");
                break;
            }
            System.out.println("Try again!");
        } while (true);
    }
}
