package com.company.deck;

import com.company.card.Card;
import com.company.card.PlayingCard;

public class SingleCard implements Deck {

    public void shuffle() {
        return;
    }

    public Card draw(boolean facing) {
        Input input=new Input();
        int cardValue= input.inputNumberText("card value: ");
        String cardSuit=input.inputStringText("card suit: ");
        return new PlayingCard(cardValue,cardSuit);
    }

    public boolean deckEmpty() {
        return false;
    }
}
