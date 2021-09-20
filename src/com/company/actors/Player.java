package com.company.actors;

import com.company.ui.Input;

public class Player implements Actor{

    private Input input = new Input();
    private String playerName;


    public Player() {
        this.playerName = Input.inputStringText("What is your name? ");

    }

    public String getName() {
        return playerName;
    }



    @Override
    public void getAction() {
        System.out.println("performed action");
    }

}
