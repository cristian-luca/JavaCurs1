package javaExercises.chapter2SkillBrain;

public class IntArrayIndex {
    public static void main(String[] args) {
        int intArray[] = new int[9];
        intArray[0] = 1;
        for (int i = 1; i < intArray.length; i++) {
            intArray[i] = intArray[0] + 2 * i;
        }

        for (int i = 0; i < intArray.length; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println(i + " is index valid");
        }
    }
}
/*
Definiti un array cu 9 elemente si parcugeti-l cu structura for
(tipul de date este la alegere). Daca iteratia este la indexul 2,
sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia.
 Altfel, sa se afiseze mesajul “Index valid” pe ecran.
 */