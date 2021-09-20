package com.company.actors;

public class Dealer implements Actor {

    private static final String NAME = "Dealer";


    @Override
    public String getName() {
        return NAME;
    }


    @Override
    public void getAction() {
        System.out.println("performed Action");
    }

}