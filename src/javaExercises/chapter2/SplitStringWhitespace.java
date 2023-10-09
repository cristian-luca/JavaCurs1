package javaExercises.chapter2;

public class SplitStringWhitespace {
    public static void main(String[] args) {
    SplitStringWhitespace obj = new SplitStringWhitespace();
    obj.splitStringWhitespace("I learn Java language with Alexndru Zaharia mentor.");
    }

    public void splitStringWhitespace(String str) {
        String [] strParts = str.split(" ");

        for (String s : strParts) {
            System.out.println(s);
        }
    }
}
