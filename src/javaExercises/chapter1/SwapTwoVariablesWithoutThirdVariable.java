package javaExercises.chapter1;

import utils.Utils;

public class SwapTwoVariablesWithoutThirdVariable {
    public static void main(String[] args) {

        System.out.println("Before Swapping");
        System.out.println("Value of a is: ");
        int a = Utils.scanner().nextInt();
        System.out.println("Value of b is: ");
        int b = Utils.scanner().nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping");
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
    }
}
