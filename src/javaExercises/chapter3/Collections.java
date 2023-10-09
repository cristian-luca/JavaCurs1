package javaExercises.chapter3;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<Integer> elemente = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            elemente.add(i);
        }

        int sum = 0;
        for (int i : elemente) { //Integer
            sum += i;
        }
        System.out.println("Suma elementelor listei noastre este:" + sum);




    }
}
