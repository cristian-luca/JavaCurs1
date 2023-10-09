package javaExercises.chapter2SkillBrain;

public class EmptyArray {

    public static void main(String[] args) {

        double array1[] = {};
        isEmptyArray(array1);
        double array2[] = {0.9, 9.8, 5.8};
        isEmptyArray(array2);
    }
    public static void isEmptyArray(double arrayDouble[]) {

        if (arrayDouble.length == 0) {
            System.out.println("This array is empty");
        } else {
            System.out.println("This array is not empty");
        }
    }
}