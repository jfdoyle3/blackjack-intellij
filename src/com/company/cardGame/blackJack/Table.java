package com.company.cardGame.blackJack;

import com.company.cardGame.actor.Dealer;
import com.company.cardGame.actor.Player;
import com.company.cardGame.deck.Deck;
import com.company.cardGame.deck.RiggedDeck;
import com.company.cardGame.deck.StandardDeck;

import java.util.ArrayList;
import java.util.List;

public class Table {

    // TODO: try to implement multiple hands.
    List<Hand> playerHands = new ArrayList<>();
    // TODO: more comfortable -> try to accomplish without the players list.
    List<Actor> players = new ArrayList<>();
    Hand dealer = new Hand(new Dealer());
    Deck deck;
    int BUST_VALUE = 21;
    /*
         Idea: Objective: To get players no longer playing to be sorted/placed at the end of the list to be removed.
         try using .sort(handTotal) or .set(Player's index) to the end of List.
     */
    public void playRound() {
        deck = new StandardDeck();
//        deck = new RiggedDeck();
        deck.shuffle();
        playerHands.add(new Hand(new Player("player")));
        /*
        0. take bets
        1. deal cards
        b2. see who won
        a2. players turn
        a3. dealers turn
        a4. see who one
         */
        playerHands.get(0).placeBet();
        deal();
        displayTable();
        while (turn(playerHands.get(0))) {
        }
        System.out.println(playerHands.get(0).displayHand());
        while (turn(dealer)) ;
        displayTable();
        determineWinner();
        System.out.println(playerHands.get(0).getBalance());
    }

    private void displayTable() {
        StringBuilder output = new StringBuilder();
        output.append(dealer.getName() + " ").append(dealer.displayHand()).append("\n");
        output.append(playerHands.get(0).getName() + " ").append(playerHands.get(0).displayHand());
        System.out.println(output);
    }

    private void deal() {
        for (int count = 0; count < 2; count++) {
            // list of hands
            dealer.addCard(deck.draw());
            playerHands.get(0).addCard(deck.draw());
        }
    }

    private void determineWinner() {
        if (playerHands.get(0).getValue() > BUST_VALUE) {
            System.out.println("Player Busted");
            return;
        }
        if (playerHands.get(0).getValue() > dealer.getValue() || dealer.getValue() > BUST_VALUE) {
            System.out.println("Player Wins");
            playerHands.get(0).payout(Hand.NORMALPAY);
            return;
        }
        if (playerHands.get(0).getValue() == dealer.getValue()) {
            System.out.println("Push");
            playerHands.get(0).payout(Hand.PUSHPAY);
            return;
        }
        System.out.println("Dealer Wins");
    }

    private boolean turn(Hand activeHand) {
        System.out.println(dealer.getName() + " " + dealer.displayHand());
        byte action = activeHand.getAction();
        return switch (action) {
            case Actor.QUIT -> stand(activeHand);
            case Actor.HIT -> hit(activeHand);
            case Actor.STAND -> stand(activeHand);
            case Actor.DOUBLE -> doubleDown(activeHand);
            case Actor.SPLIT -> split(activeHand);
            default -> false;
        };
    }

    private boolean hit(Hand activeHand) {

        activeHand.addCard(deck.draw());
        System.out.println("Hit");
        if (activeHand.getValue() > BUST_VALUE) {
            System.out.println("Busted");
            return false;
        }
        return true;
    }

    private boolean stand(Hand activeHand) {

        System.out.println("Stand");
        return false;
    }

    private boolean doubleDown(Hand activeHand) {

        activeHand.doubleBet();
        System.out.println("Bet Doubled");
        hit(activeHand);
        return false;
    }

    private boolean split(Hand activeHand) {
        return doubleDown(activeHand);
    }
}
