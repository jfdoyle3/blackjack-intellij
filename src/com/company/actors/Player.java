package com.company.actors;

import com.company.ui.ErrorConsole;
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
    public int getAction(int score) {
        int option;
        do {
            option = Input.inputNumberText("Choices: 1-Hit or 2-Stand? ");

        } while (option < 1 || option > 2);

        return option;
    }





}
