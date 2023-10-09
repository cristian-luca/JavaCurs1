package javaExercises.chapter1;

public class IndexOf {
    public static void main(String[] args) {
        //public int indexOf(String str)
        String str = "Hello!";
        System.out.printf("o is located at index: %d", str.indexOf('o'));
        System.out.println();
        //public int indexOf(String str, int fromIndex)
        System.out.printf("l is located at index: %d", str.indexOf('l',2));
        System.out.println();
        System.out.printf("l is located at index: %d", str.indexOf('l',3));
        System.out.println();
        System.out.printf("l is located at index: %d", str.indexOf('l',4));
        System.out.println();

        str = "Image!";
        // public int indexOf(int char)
        System.out.printf("age is located at index: %d", str.indexOf("age"));
        System.out.println();
        // public int indexOf(int char, int fromIndex)
        System.out.printf("age is located at index: %d", str.indexOf("age", 3));
        System.out.println();
        System.out.printf("age is located at index: %d", str.indexOf("age", 2));
//        Parameter Values
//        Parameter	Description
//        str	A String value, representing the string to search for
//        fromIndex	An int value, representing the index position to start the search from
//        char	An int value, representing a single character, e.g 'A', or a Unicode value
//        Technical Details
//        Returns:	An int value, representing the index of the first occurrence of the character in the string, or -1 if it never occurs

    }
}
