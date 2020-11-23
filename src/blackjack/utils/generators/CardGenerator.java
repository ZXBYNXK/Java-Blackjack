package blackjack.utils.generators;

import blackjack.utils.UserInteractions.Console;

import java.util.HashMap;

public class CardGenerator extends Generator {
    private static final String[] SUITS = {"♢", "♠", "♡", "♣"};
    private static final String[] FACES = {"Jack", "Queen", "King", "Ace"};
    private static final int FACE_VALUES = 13;
    public static int low = 1;
    public static int high = 10;
    public static String suit() { return SUITS[generate(SUITS.length) - 1]; }
    public static String face() {
        int faceValue = generate(FACE_VALUES);
        if (faceValue <= high && faceValue > low) {
            return faceValue + "";
        } else {
            return FACES[generate(FACES.length - 1) - 1];
        }
    }
    public static String nextCard() {
        return suit() + face();
    }

}
