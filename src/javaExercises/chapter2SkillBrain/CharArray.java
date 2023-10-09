package javaExercises.chapter2SkillBrain;

public class CharArray {
    public static void main(String[] args) {
        char charArray[] = new char[7];

        charArray[0] = 'A';
        charArray[1] = 'c';
        charArray[2] = 'D';
        charArray[3] = 'b';
        charArray[4] = '1';
        charArray[5] = '!';
        charArray[6] = '*';

        for (int i = 0; i < charArray.length; i += 2) {
            System.out.println("Elementele sirului de caractere din 2 in 2 sunt: " + charArray[i]);
        }
    }
}
/* Definiti un array de char-uri.
   Iterati array-ul folosind structura for, si
   afisati pe ecran cate al doilea caracter din sir.
*/