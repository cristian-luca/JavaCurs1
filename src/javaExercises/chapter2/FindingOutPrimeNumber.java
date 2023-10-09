package javaExercises.chapter2;

import utils.Utils;

public class FindingOutPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a positive number greater than equal 2: ");
        int number = Utils.scanner().nextInt();

        boolean flag = false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}



