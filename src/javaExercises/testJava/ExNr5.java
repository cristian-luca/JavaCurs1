package javaExercises.testJava;

public class ExNr5 {
    /*
    Scrieti un for care sa imi calculeze suma tuturor elementelor iterate,
    conditia din for i < 15;
     */
    public static void main(String[] args) {
        System.out.println(calculeazaSumaPrimelor14NrNaturale());
    }
    public static int calculeazaSumaPrimelor14NrNaturale() {
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += i;
        }
        return sum;
    }
}




