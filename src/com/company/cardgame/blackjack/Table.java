package com.company.cardgame.blackjack;

import com.company.cardgame.actors.Dealer;
import com.company.cardgame.actors.Player;
import com.company.cardgame.deck.Deck;
import com.company.cardgame.deck.StandardDeck;

public class Table {
    Hand player = new Hand(new Player("player"));
    Hand dealer = new Hand(new Dealer());
    Deck deck;

    public void playRound() {
        deck = new StandardDeck();
        deck.shuffle();
        /*
        0. take bets
        1. deal cards
        b2. see who won
        a2. players turn
        a3. dealers turn
        a4. see who one
         */
        deal();
        displayTable();
        turn(player);
        turn(dealer);
        displayTable();
        determineWinner();
    }

    private void displayTable() {
        StringBuilder output = new StringBuilder();
        output.append("Dealer: ").append(dealer.displayHand()).append("\n");
        output.append("Player: ").append(player.displayHand());
        System.out.println(output);
    }

    private void deal() {
        for (int count = 0; count < 2; count++) {
            // list of hands
            dealer.addCard(deck.draw());
            player.addCard(deck.draw());
        }
    }

    private void determineWinner() {
        if (player.getValue() > dealer.getValue()) {
            System.out.println("Player Wins");
            return;
        }
        if (player.getValue() == dealer.getValue()) {
            System.out.println("Push");
            return;
        }
        System.out.println("Dealer Wins");
    }

    private void turn(Hand activeHand) {
        System.out.println("Dealer: " + dealer.displayHand());
        byte action = activeHand.getAction();
        switch (action) {
            case 0 -> System.exit(0);
            case 1 -> hit(activeHand);
            case 2 -> stand(activeHand);
            case 3 -> doubleDown(activeHand);
            case 4 -> split(activeHand);
            default -> System.out.println("ERROR bad action: " + action);
        }

    }

    private void hit(Hand activeHand) {
     activeHand.addCard(deck.draw());
        System.out.println("Hit");
    }

    private boolean stand(Hand activeHand) {
        return false;
    }

    private void doubleDown(Hand activeHand) {
        // TODO: double
        activeHand.doubleBet();
        System.out.println("Double Down");
        hit(activeHand);
    }

    private void split(Hand activeHand) {
        doubleDown(activeHand);
    }
}
