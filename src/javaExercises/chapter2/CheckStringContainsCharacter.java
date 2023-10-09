package javaExercises.chapter2;

public class CheckStringContainsCharacter {
    public static void main(String[] args) {
        CheckStringContainsCharacter obj = new CheckStringContainsCharacter();
        System.out.println(obj.stringContainsCharacter("Java Language", "e"));
        System.out.println(obj.stringContainsCharacter("Java Language", "ava"));
        System.out.println(obj.stringContainsCharacter("Java Language", "l")); //case-sensitive
        System.out.println(obj.stringContainsCharacter("Java Language", "t"));
    }

    public boolean stringContainsCharacter (String str, CharSequence s) {
        return str.contains(s);
    }
}
