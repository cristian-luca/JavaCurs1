package javaExercises.chapter2SkillBrain;

public class ArrayBidimensional {
    public static void main(String[] args) {
        double[][] tablouBidimensional = new double[3][5];

        for (int i = 0; i < tablouBidimensional.length; i++) {
            for (int j = 0; j < tablouBidimensional[i].length; j++) {
                tablouBidimensional[i][j] = i - j;
            }
        }

        for (int i = 0; i < tablouBidimensional.length; i++) {
            for (int j = 0; j < tablouBidimensional[i].length; j++) {
                System.out.print(tablouBidimensional[i][j] + " ");
            }
            System.out.println(" ");
            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
        }
        System.out.println("================================");

        for (int i = 0; i < tablouBidimensional.length; i++) {
            for (int j = 0; j < tablouBidimensional[i].length; j++) {
                if (i == 1 || j == 1 || j == 2 || j == 3) {
                    continue;
                }
                System.out.print(tablouBidimensional[i][j] + " ");
            }
            System.out.println(" ");
            //System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
        }
    }
}
/*
Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3,
respectiv 5 elemente. Initializati array-ul.
Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
 */
