package javaExercises.chapter3;

public class AfliCele3NrDacaStiiMediaLorAitmetica {
    /*Media aritmetica a 3 numere este 14.
	  Primul este cu 7 mai mare decat al doilea si al treilea este de 3 ori
	  mai mare decat al doilea.Sa se afle cele trei numere.*/

    public static void main(String[] args) {
        /*
        Deoarece media aritmetica a celor 3 numere este 14 => a+b+c=42 => a<=42, b<=42, c<=42
        Deoarece a=7+b => a>=8
        Deoarece c=3 b => c>= 3
         */
        for (int a = 8; a <= 42; a++)
            for (int b = 1; b <= 42; b++)
                for (int c = 3; c <= 42; c++)
                    if ((a + b + c) / 3 == 14 && a == 7 + b && c == 3 * b) {
                        System.out.print(a + " este primul numar, " + b + " este al doilea numar si ");
                        System.out.println(c + " este al treilea numar.");
                    }
    }
}
