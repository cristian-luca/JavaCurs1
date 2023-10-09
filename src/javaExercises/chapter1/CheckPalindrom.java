package javaExercises.chapter1;


import utils.Utils;

public class CheckPalindrom {
    public static void main(String[] args) {
        System.out.println("Enter a string from console: ");
        String textFromConsole = Utils.scanner().nextLine();

        String reverse = "";
        for(int i = textFromConsole.length() - 1; i >= 0; i--) {
            reverse += textFromConsole.charAt(i);
        }

        if(textFromConsole.equals(reverse)) {
            System.out.println(textFromConsole + " is a palindrom");
        } else {
            System.out.println(textFromConsole + " is not a palindrom");
        }
    }

}
