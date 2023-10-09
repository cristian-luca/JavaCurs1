package javaExercises.chapter2SkillBrain;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        double[] doubleArray = new double[10];
        for (int i = doubleArray.length - 1; i >= 0 ; i--) {
            doubleArray[i] = 2 * i;
        }
        sortArray(doubleArray);
    }

    public static void sortArray(double[] a) {
        Arrays.sort(a);
        System.out.printf("\nSorted array in ascending order is: %s", Arrays.toString(a));
    }

}
