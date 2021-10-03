package com.company.cardGame.actor;

import com.company.cardGame.blackJack.Actor;
import com.company.cardGame.blackJack.Hand;

public class Blodgett implements Actor {

    

    @Override
    public String getName() {
        return null;
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
    public byte getAction(Hand hand, Hand dealer) {
        return 0;
    }

    @Override
    public void addBalance(double amt) {

    }
}
