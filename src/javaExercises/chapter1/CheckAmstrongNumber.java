package javaExercises.chapter1;

//An Armstrong number of three digits is an integer such that the sum of the cubes
//of its digits is equal to the number itself. For example, 371 is an Armstrong
//number since 3**3 + 7**3 + 1**3 = 371.
//-- > ridicarea la cub se face cu clasa Math.pow();

import utils.Utils;

public class CheckAmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number of three digits: ");
        int number = Utils.scanner().nextInt();
        int result = 0;
        int num = number; //Why?

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, 3);;
            num = num / 10;
        }

        if (number == result) {
            System.out.println(result + " is an Amstrong number");
        } else {
            System.out.println(result + " isn't an Amstrong number");
        }
    }
}