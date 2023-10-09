package javaExercises.chapter2;

public class HowUseIndexOf {
    public static void main(String[] args) {
        String str = "Java Language";
        System.out.printf("v is located at index: %d", str.indexOf("v"));
        System.out.println();
        System.out.printf("m is located at index: %d", str.indexOf("m"));
        System.out.println();
        System.out.printf("ang is located at index: %d", str.indexOf("ang"));
        System.out.println();
        System.out.printf("age is located at index: %d", str.indexOf("age", 9));
        System.out.println();
        System.out.printf("Ja is located at index: %d", str.indexOf("Ja", 3));
    }
}
