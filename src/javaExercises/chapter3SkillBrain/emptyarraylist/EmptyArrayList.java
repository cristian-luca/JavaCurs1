package javaExercises.chapter3SkillBrain.emptyarraylist;

import java.util.ArrayList;

public class EmptyArrayList {
    public static void isEmptyArrayList(ArrayList<Elev> arrayList) {

        if (arrayList.isEmpty()) {
            System.out.println("This ArrayList is empty");  //se poate folosi conditia arrayList.size() == 0
        } else {
            System.out.println("This ArrayList is not empty");
        }
    }

    public static void main(String[] args) {
        ArrayList<Elev> arrayList = new ArrayList<>();
        isEmptyArrayList(arrayList);
        System.out.println(arrayList);

        System.out.println("=================================");

        arrayList.add(new Elev(1, "Alex"));
        arrayList.add(new Elev(2, "Andrei"));
        arrayList.add(new Elev(3, "Cristi"));

        isEmptyArrayList(arrayList);
        System.out.println(arrayList);
    }
}

