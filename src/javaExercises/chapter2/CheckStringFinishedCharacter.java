package javaExercises.chapter2;

public class CheckStringFinishedCharacter {
    public static void main(String[] args) {
        CheckStringFinishedCharacter obj = new CheckStringFinishedCharacter();
        System.out.println(obj.stringFinishedCharacter("Java Language", "e"));
        System.out.println(obj.stringFinishedCharacter("Java Language", "ava"));
        System.out.println(obj.stringFinishedCharacter("Java Language", "age"));
        System.out.println(obj.stringFinishedCharacter("Java Language", "t"));
    }

    public boolean stringFinishedCharacter (String str, String s) {
        return str.endsWith(s);
    }
}
