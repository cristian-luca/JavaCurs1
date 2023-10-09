package javaExercises.colectiidate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreateDataBase {
    public static void main(String[] args) {
        String propozitie = "Mentorul Alex ne invata Colectii.";
        String[] array = propozitie.split(" ");
        System.out.println(array[1]);
        ArrayList<String> obj1 = new ArrayList<>();
       /* CreateDataBase ceas = new CreateDataBase();
        System.out.println(ceas instanceof CreateDataBase); //true
        System.out.println(ceas instanceof BMW);  //false  */
        for (String element : array) {
            obj1.add(element);
        }

        System.out.println(obj1);
        System.out.println(obj1.get(0));

        obj1.add("Cristi");
        obj1.add("Monica");
        System.out.println(obj1);
        obj1.set(6, "CristiNou");
        System.out.println(obj1);

        List<String> obj2 = new ArrayList<>(); //nu poti face cu new List
        obj2.add("Alex"); //literal in memoria String pool
        obj2.add(new String("Cristian")); //creat cu new in memoria heap
        System.out.println(obj2);
//        for (String element : obj2) {
//            System.out.println("Elemente obj2 sunt: " + element);
//        }

        obj2.stream().forEach(System.out::println);
        System.out.println(obj2.stream().findFirst().get());//merge si fara get

        //obj2.stream().filter(v->v.contains("ceas")).collect(Collectors.toList());
        System.out.println(obj2.stream().filter(v->v.contains("Alex")).collect(Collectors.toList()));

    }
}
