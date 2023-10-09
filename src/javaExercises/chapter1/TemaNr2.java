package javaExercises.chapter1;

public class TemaNr2 {
    public static void main(String[] args) {
        //printName();  //ruleaza OK

        //System.out.println(sumTwoNumbers(12.5, 123.24));  //ruleaza OK


        //int c = divideTwoNumbers(275, 25);
        //System.out.println(c);  //ruleaza OK

        //        a. -10 + 3+7;
        //System.out.println(-10+3+7);  //ruleaza OK

        //        b. (34+5) % 3/sau 2 – incercati ambele variante;
        //System.out.println((34+5) % 3);   //ruleaza OK
        //System.out.println((34+5) % 2);   //ruleaza OK

        //        c. 20 + -3*5/2;
        //System.out.println(20 + -3*5/2);  //ruleaza OK

        //        d. 5 + 25/5*2 – 6*8%2;
                //System.out.println(5+((25/5)*2)–(6*(8%2)));
                //apare eroarea java: illegal character: '\u2013' DE CE?
        System.out.println(5+(25/(5*2)-(6*(8%2))));
    }

    //Write a java program to print “Hello” on screen and then
    // print your name on a separate line:
    public static void printName() {
        System.out.println("Hello");
        System.out.print("Cristian");
    }

    //Write a Java program to print the sum of two numbers: a = 12.5, b = 123.24;
    //am folosit alte denumiri de variabile
    public static double sumTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    //Write a Java program to divide two numbers and print on the screen: z = 275, v = 25,
    // c= salvati rezultatul in aceasta variabila ;
    //am folosit alte denumiri de variabile
    public static int divideTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}







