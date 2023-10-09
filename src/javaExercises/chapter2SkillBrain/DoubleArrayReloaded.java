package javaExercises.chapter2SkillBrain;
/*
  Definiti un array de double, cu valori zecimale. Iterati array-ul
  folosind strutura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
  Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
 */
public class DoubleArrayReloaded {
    public static void main(String[] args) {
        double[] doubleArray = new double[15];
        //double doubleArray2[] = new double[10];
        //double doubleArray3[] = new double[7];
        //double doubleArray4[] = new double[9];
        //am testat si cele trei variante comentate de arrays de tip double
        boolean found1, found2;

        //for (int i = 0; i < doubleArray2.length; i++) {
        // doubleArray2[i] = doubleArray2.length - i;
        //}

        //for (int i = 0; i < doubleArray3.length; i++) {
        // doubleArray3[i] = 4.5;
        //}

        //for (int i = 0; i < doubleArray4.length; i++) {
        // doubleArray4[i] = 0;
        //}

        for (int i = 0; i < doubleArray.length; i++) {
            if (i <= 3) {
                doubleArray[i] = -5;
            } else if (i == 4) {
                doubleArray[i] = 4.5;
            } else if (i > 4 && i <= 10) {
                doubleArray[i] = i;
            } else {
                doubleArray[i] = 3 * i;
            }
        }

        System.out.print("\n---------------------------------------------------------------------\n");
        for (double element : doubleArray) {
            System.out.print(element + " ");
        }

        System.out.print("\n---------------------------------------------------------------------\n");
        found1 = false;
        found2 = false;
        for (double element : doubleArray) {
            if (element == 4.5) {
                System.out.println(element);
                found1 = true;
            }

            if (element > 5) {
                System.out.println("element peste 5");
                found2 = true;
            }
        }
        if (found1 == false) {
            System.out.println("Nu exista vreun element in sir cu valoarea de 4.5");
        }

        if (found2 == false) {
            System.out.println("Nu exista vreun element peste 5");
        }
        System.out.print("---------------------------------------------------------------------\n");

    }
}


