package javaExercises.chapter1;

public class ConvertIntToString {
    public static void main(String[] args) {

        Integer i = new Integer(123);   //Integer i = 123;

        System.out.println("Before conversion: " + i.getClass().getName());

        System.out.println("After conversion: " + String.valueOf(i).getClass().getName());

        //To check the type of variable, use the getClass().getName() method.
    }
}
