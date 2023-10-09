package javaExercises.chapter2;

public class ReplaceOneStringWithAnotherString {
    public static void main(String[] args) {
        String str = new String("Java Language");
        System.out.println( "The initial String is : "+ str);
        String str2 = str.replaceAll( "Java" , "Python" );
        System.out.println( "The String after substitution became : "+ str2);
    }
}
