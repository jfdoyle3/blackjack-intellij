package com.company.actors;

public class Dealer implements Actor {


    @Override
    public String getName() {
        return "Dealer";
    }

    @Override
    public int getBalance(){ return 0;}
    @Override
    public void getAction() {
        System.out.println("performed Action");
    }

    @Override
    public int getBet(int w){
        return 0;
    }

}