package com.company.card;

public class PlayingCard extends Card {

    private int value;
    private String suit;

    protected boolean faceDown;

    public PlayingCard(String cardFace, String suit, int value) {
        super(cardFace, true);
        this.suit=suit;
        this.value=value;
    }


    public void flip() {
        isFaceDown = !isFaceDown;
    }

    @Override
    public String getCardFace() {
        return null;
    }

//    public String getCardFace() {
//        if (this.faceDown)
//            return this.cardFace;
//        return "[#]";
//    }


//    @Override
//    public String toString() {
//        return "Card{ faceUpDown: " + faceDown + ", cardFace: '" + cardFace + " }";
//    }


    public int getValue() {
        return this.value;
    }

    public boolean isFaceDown() {
        return faceDown;
    }

    public String toString() {
        String output = switch (value) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> value == 10 ? Integer.toString(value) : "" + value;
        };
        return output + suit;
    }
}
