package com.company.cardGame.actor;

import com.company.cardGame.blackJack.Actor;
import com.company.cardGame.blackJack.Hand;

public class Dealer implements Actor {
    int STAND_VALUE = 17;

    public String getName() {
<<<<<<< HEAD
        return "John Cleese";
=======
        return "John Wick";
>>>>>>> main
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public int placeBet() {
        return 0;
    }

    @Override
<<<<<<< HEAD
    public void addBalance(int amt) { return; }

    public byte getAction(Hand hand) {
=======
    public void addBalance(double amt) { return; }

    public byte getAction(Hand hand, Hand dealer) {
>>>>>>> main
        return hand.getValue() < STAND_VALUE ? HIT : STAND;
    }

}
