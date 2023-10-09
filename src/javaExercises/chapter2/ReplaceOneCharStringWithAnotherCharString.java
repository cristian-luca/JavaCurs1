package javaExercises.chapter2;

public class ReplaceOneCharStringWithAnotherCharString {
    public static void main(String[] args) {
        String str = "Java Language";
        String str2 = str.replace('L', 'l');

        System.out.println("The original String is : " + str);
        System.out.println("After replacement String is : " + str2);
    }

}
