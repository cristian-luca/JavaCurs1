package javaExercises.chapter2;

public class AmstrongNumber3Digits {
    public static void main(String[] args) {
        for(int num= 100; num <= 999; num++) {
            int temp;
            int digit;
            double sum = 0;

            temp = num;

            while (temp != 0)
            {
                digit = temp % 10;
                sum += Math.pow(digit, 3);
                temp /= 10;
            }
            if(sum == num) {
                System.out.println(num + " is an Armstrong number with 3 digits. Cool! *****");
            }
            else {
                System.out.println(num + " is not an Armstrong number with 3 digits");
            }
        }
    }

}
