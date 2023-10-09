package javaExercises.chapter2SkillBrain;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSuma5Elements {
    static int sum = 0;

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(15);
        lista.add(-46);
        lista.add(90);
        lista.add(-76);
        for (int i : lista) {
            sum += i;   //am folosit unboxing
        }
        System.out.println("Suma celor 5 elemente ale listei de tip Integer este: " + sum);
    }
}
