package javaExercises.chapter2SkillBrain;

public class PlayYourCards {

    /*
    In this exercise we will simulate the first turn of a Blackjack game.
    Note: Commonly, aces can take the value of 1 or 11 but for simplicity
    we will assume that they can only take the value of 11.
     */
    public enum Card {
        ACE(11),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(10),
        QUEEN(10),
        KING(10);

        //Nu am stiut sa tratez situatia cu valoarea 0 din tabelul cu carti de joc!
        private final int val;

        private Card(int val) {  //Modifier 'private' is redundant for enum constructors says IJ
            this.val = val;
        } //Modifier 'private' is redundant for enum constructors

        public int getValue() {
            return this.val;
        }
    }

    /*
     Implement a function to calculate
     the numerical value of a card given its name using conditionals.
     */
    public static int parseCard(String card) {
        return Card.valueOf(card).getValue();
    }

    // Blackjack (two cards that sum up to a value of 21)
    public static boolean isBlackjack(String card1, String card2) {
        return Card.valueOf(card1).getValue() + Card.valueOf(card2).getValue() == 21;
    }

    /*
    Category: Large Hand
    If you have a pair of aces you must always split them.
    If you have a Blackjack (two cards that sum up to a value of 21),
    and the dealer does not have an ace, a figure or a ten then you automatically win.
    If the dealer does have any of those cards then you'll have to stand and wait
    for the reveal of the other card.
     */
    public static String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) {
            return "P";               //it means SPLIT
        } else {
            if (dealerScore < 10) {
                return "W";           //it means WIN
            } else {
                return "S";           // it means STAND
            }
        }
    }

    /*
    Category: Small Hand
    If your cards sum up to 17 or higher you should always stand.
    If your cards sum up to 11 or lower you should always hit.
    If your cards sum up to a value within the range [12, 16] you should
    always stand unless the dealer has a 7 or higher, in which case you should always hit.
     */
    public static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";       //it means HIT
        } else {
            if (dealerScore >= 7) {
                return "H";
            }
            return "S";
        }
    }


    public static void main(String[] args) {
        System.out.println(parseCard("ACE"));                       //11
        System.out.println(parseCard("QUEEN"));                     //10
        System.out.println(isBlackjack("ACE", "ACE"));              //false
        System.out.println(isBlackjack("ACE", "TEN"));              //true
        System.out.println(largeHand(isBlackjack("ACE", "TEN"), 7));  //W
        System.out.println(largeHand(isBlackjack("ACE", "TEN"), 11)); //S
        System.out.println(largeHand(!isBlackjack("ACE", "TEN"), 7)); //P
        System.out.println(smallHand(15, 17));       //H
        System.out.println(smallHand(15, 6));        //S
        System.out.println(smallHand(18, 2));        //S
        System.out.println(smallHand(10, 1));        //H
    }
}




