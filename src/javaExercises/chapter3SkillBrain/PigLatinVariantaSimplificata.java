package javaExercises.chapter3SkillBrain;

public class PigLatinVariantaSimplificata {
    public static void main(String[] args) {
        System.out.println(PigLatinVariantaSimplificata.pigLatin("Mancare"));
        System.out.println(PigLatinVariantaSimplificata.pigLatin("alo"));
        System.out.println(PigLatinVariantaSimplificata.pigLatin("xyt"));
    }

    static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'a' || ch == 'E'
                || ch == 'e'|| ch == 'I'|| ch == 'i'
                || ch == 'O'|| ch == 'o'|| ch == 'U' || ch == 'u';
    }

    public static String pigLatin(String input) {
        int sizeInput = input.length();
        String answer = "";
        int i;
        for (i = 0; i < sizeInput; i++) {
            if(isVowel(input.charAt(i))) {
                answer = input.substring(i);
                break;
            }
        }
        if (i == sizeInput) {
            return "Cuvantul nu contine nicio vocala si nu putem aplica regulile de la PigLatin.";
        }
        answer += input.substring(0, i);
        answer += "ay";
        return answer;
    }
}
