package javaExercises.chapter2SkillBrain;


public class SortArrayPreluata {
    public static void main(String[] args) {
        double[] doubleArray = new double[10];
        for (int i = doubleArray.length - 1; i >= 0 ; i--) {
            doubleArray[i] = 2 * i;
        }
        sortArrayAscending(doubleArray);
    }

    private static void sortArrayAscending(double[] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = i + 1; j < doubleArray.length; j++) {
                if (doubleArray[i] > doubleArray[j]) {
                    double temp = doubleArray[i];
                    doubleArray[i] = doubleArray[j];
                    doubleArray[j] = temp;
                }
            }
        }
        for (double item : doubleArray) {
            System.out.print(item + " ");
        }
    }


}
