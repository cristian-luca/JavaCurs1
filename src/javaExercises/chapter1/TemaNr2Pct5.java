package javaExercises.chapter1;

public class TemaNr2Pct5 {
    public static void main(String[] args) {

        // Write a Java program to print the sum, multiply, subtract(scadere),
        // divide and remainder of two numbers: x = 5, y = 34, z = 23;
        // am folosit numai variabilele y si x
        // ruleaza OK
        
        int y = 34;
        int x = 5;

        int sum = y + x;
        int substract = y - x;
        int multiply = y * x;
        int divide = y / x;
        int remainder = y % x;

        System.out.print("The sum is ");
        System.out.println(sum);
        System.out.print("The substract is ");
        System.out.println(substract);
        System.out.print("The multiply is ");
        System.out.println(multiply);
        System.out.print("The divide is ");
        System.out.println(divide);
        System.out.print("The remainder is ");
        System.out.println(remainder);

    }
}
