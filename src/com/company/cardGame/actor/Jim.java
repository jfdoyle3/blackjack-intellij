package com.company.cardGame.actor;

import com.company.cardGame.blackJack.Actor;
import com.company.cardGame.blackJack.Hand;

import java.util.Random;

public class Jim implements Actor {

    private int balance=1000;
    private final int STAND_MAX=19;
    private final int DOUBLE_UNDER=14;
    private Random rand=new Random();

    @Override
    public String getName() { return "Jim"; }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public int placeBet() {
        return rand.nextInt(getBalance());
    }

    @Override
    public byte getAction(Hand hand, Hand dealer) {
       if(hand.getValue()>=STAND_MAX)
           return STAND;
       if(hand.canSplit()&&canRiskHighBet())
           return SPLIT;
       if(canRiskHighBet()&& hand.getValue()<=DOUBLE_UNDER)
           return DOUBLE;
        return HIT;
    }

    @Override
    public void addBalance(double amt) {
        balance += amt;
    }

    public boolean canRiskHighBet(){
        if (placeBet()==getBalance()/2)
            return true;
        return false;
    }
}
