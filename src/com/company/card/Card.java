package com.company.card;

public abstract class Card {

    protected boolean isFaceDown;
    protected String cardFace;


    public Card(String cardFace, boolean isFaceDown) {
        this.isFaceDown = isFaceDown;
        this.cardFace = cardFace;

    }

    public abstract void flip();
//    {
//        isFaceDown = !isFaceDown;
//    }

    public abstract String getCardFace();
//    {
//        if (this.isFaceDown)
//            return this.cardFace;
//        return "[#]";
//    }


    @Override
    public String toString() {
        return "Card{ isfaceDown: " + isFaceDown + ", cardFace: '" + cardFace + " }";
    }

}
