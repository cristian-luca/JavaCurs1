package javaExercises.chapter2SkillBrain;

public class DoubleArray {
    public static void main(String[] args) {
        double doubleArray[] = new double[77];
        doubleArray[0] = 1.5;
        for (int i = 1; i < doubleArray.length; i++) {
            if (i <= 3) {
                doubleArray[i] = doubleArray[0] + 3 * i;
            } else if (i <= 10) {
                doubleArray[i] = i;
            } else {
                doubleArray[i] = -5;
            }
        }

        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] == 4.5) {
                System.out.println(doubleArray[i] + " ==========================================================");
            } else {
                System.out.println("Nu exista vreun element in sir cu valoarea de 4.5");
            }
            if (doubleArray[i] > 5) {
                System.out.println("Element peste 5 *************************************************");
            } else {
                System.out.println("Nu exista vreun element in sir cu valoare mai mare decat 5");
            }

        }
    }

}
/*
Definiti un array de double, cu valori zecimale. Iterati array-ul
folosind strutura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
 Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
*/