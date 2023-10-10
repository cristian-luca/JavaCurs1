package javaExercises.testJava;

public class ExNr1 {
    public static void main(String[] args) {
        ExNr1 var = new ExNr1();
        var.sum();
       // System.out.println(var.x);  //a trebuit sa comentez
        /*
          java: cannot find symbol
          symbol:   variable x
          location: variable var of type javaExercises.testjava.ExNr1
         */
        // System.out.println(var.y);    //a trebuit sa comentez
        /*
            java: cannot find symbol
            symbol:   variable y
            location: variable var of type javaExercises.testjava.ExNr1
         */

    }

    public void sum() {
        int x = 10;
        int y = 15;
        System.out.println("suma: " + (10 + 15));
    }
}

