package com.company.actors;

public class Dealer implements Actor {

    static String NAME = "Dealer";


    @Override
    public String getName() {
        return NAME;
    }


    @Override
    public int getAction(int score) {
        //return score<DECISION ? HIT:STAND;
        if (score < 17) {
            return 1;
        } else {
            return 2;
        }
    }

}