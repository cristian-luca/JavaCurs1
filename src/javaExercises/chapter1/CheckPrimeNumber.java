package javaExercises.chapter1;

import utils.Utils;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter an integer positive number greater than equal to 2: ");
        int num = Utils.scanner().nextInt();
        boolean isPrime = true;  // flag to store if the number is prime or not
        // loop to check if the number is divisible by any number from 2 to num-1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;  // if the number is divisible, set the flag to false
                break;
            }
        }
        // check if the flag is still true, i.e. the number is not divisible by any number
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " isn't a prime number");
        }

    }

}
