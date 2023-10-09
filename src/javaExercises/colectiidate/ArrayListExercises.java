package javaExercises.colectiidate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class ArrayListExercises {
    /*
    1) Write a Java program to create an array list,
     add some colors (strings) and print out the collection
     */
    ArrayList<String> colours;
    public ArrayListExercises() {
        colours = new ArrayList<>();
    }
    public ArrayList<String> listOfColours (String color) {
        colours.add(color);
        return colours;
    }

    //metoda de iterat prin arraylist si sa-mi afisezi la consola fiecare element
    public void iterateThroghList() {
        for (int i = 0; i < colours.size(); i++) {
            System.out.println("Iterare cu for simplu: " + colours.get(i));
        }
    }

    public void iterateThroghListReverse() {
        for (int i = colours.size() - 1; i >= 0; i--) {
            System.out.println(colours.get(i));
        }
    }

    public void iterateList() {
        Iterator<String> iterator = colours.iterator();
        while (iterator.hasNext()) { //cat timp se gasesc elemente in lista respectiva conditia e adevarata
            System.out.println("Rulare cu iterator: " + iterator.next());
        }
    }

    public void iterateForEach() {
        System.out.println("Iterare cu for each: ");
        for (String element : colours) {
            System.out.println(element);
        }
    }

    //metoda de modificare a valorii unui anumit index
    public ArrayList<String> updatePositionByIndex(int index, String newValue) {
        colours.set(index, newValue);
        addNewValue(index, newValue);
        return colours;
    }
    //metoda void prin care sunt folosite index....
    public void addNewValue(int index, String value) {
        colours.add(index + 1, value);
    }

    //METODA randomValueList
    public void randomValueList() {
        Random random = new Random();
        System.out.println("Valori aleatorii prin random: " + colours.get(random.nextInt(colours.size())));
    }

    public void shuffleValues() {
        Collections.shuffle(colours);
    }
    public void removeElement(int index) {
        colours.remove(index);
    }

    public boolean searchElement(String value) {
        for (int i = 0; i < colours.size(); i++) {
            if (colours.get(i).contains(value)) {
                return true;
            }
        }
        return false;
    }

    public void emptyArrayList() {
        colours.clear();
    }

    public static void main(String[] args) {
        ArrayListExercises obj1 = new ArrayListExercises();
        obj1.listOfColours("red");
        obj1.listOfColours("yellow");
        obj1.listOfColours("blue");
        System.out.println(obj1.colours);
        System.out.println();
        obj1.iterateThroghList();
        System.out.println();
        obj1.iterateThroghListReverse();
        System.out.println();
        obj1.iterateList();
        System.out.println();
        obj1.iterateForEach();
        System.out.println();
        System.out.println("Lista curenta de culori " + obj1.colours);
        System.out.println(obj1.updatePositionByIndex((obj1.colours.size() / 2) * 2, "brown"));
        System.out.println();
        obj1.randomValueList();
        obj1.randomValueList();
        obj1.randomValueList();
        obj1.randomValueList();
        obj1.randomValueList();
        obj1.randomValueList();
        System.out.println();
        System.out.println(obj1.colours);
        System.out.println();
        obj1.shuffleValues();
        System.out.println("Shuffle: " + obj1.colours);
        System.out.println();
        obj1.removeElement(1);
        System.out.println(obj1.colours);
        System.out.println();
        System.out.println(obj1.searchElement("red"));
        System.out.println(obj1.searchElement("brown"));
        System.out.println(obj1.searchElement("yellow"));
        System.out.println();
        obj1.emptyArrayList();
        System.out.println(obj1.colours);
    }
}
