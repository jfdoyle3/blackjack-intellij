package com.company.cardgame.actors;

import com.company.cardgame.blackjack.Hand;
import com.company.cardgame.blackjack.Actor;

public class Dealer implements Actor {
    int STAND_VALUE = 17;

    public String getName() {
        return "John Wick";
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public int getBet() {
        return 0;
    }

    public byte getAction(Hand hand) {
        return hand.getValue() < STAND_VALUE ? HIT : STAND;
    }
}