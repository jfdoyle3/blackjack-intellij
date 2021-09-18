package com.company.ui;

import com.company.card.Card;

import java.util.List;

public class Console {

    public static void displayCard(Card card) {
        System.out.print(card.toString() + " ");
    }

    public static void horzLine() {
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void askPlayerName() {
        System.out.print("What is the player name? ");
    }

    public static void welcomePlayer(String name, int chips) {
        System.out.printf("Welcome %s to the game. You have %d chips to start", name, chips);
    }

    public static void cardFaceDown(int numberOfCards) {
        for (int idx = 0; idx < numberOfCards; idx++) {
            System.out.println("##");
        }
    }

    public static void bet(int chips) {
        System.out.printf("You have $%,d. How much do you want to bet? ", chips);
    }

    public static void consoleHit(int totalCardCount) {
        System.out.printf("\nYou have %d showing. Do you want to (H)it or (S)tand?", totalCardCount);
    }

    public static void placedBet(Hand hand, int betAmount) {
        System.out.printf("%s placed a bet of $%,d  \n", hand.getName(),betAmount);
    }

    public static void displayHand(List<Card> hand) {
        for (Card card : hand) {
            System.out.print(card.toString() + " ");
        }
    }

    public static void stand(String name, int stands) {
        System.out.printf("\n%s stands at %d\n",name, stands);

    }

    public static void bust(String name,int bust) {
        System.out.printf("\n%s bust with %d\n", name,bust);
    }
    public static void gameOver() {
        System.out.println("\nGame Over: You're busted you have no more chips");
    }

    public static void win(String winner) {
        System.out.printf("Winner is: %s",winner);
    }
    public static void push() {
        System.out.println("Push");
    }
    public static void hit(Hand hand, Card card) {
        System.out.printf("%s Hits and gets:  %s\n",hand.getName(),card);
    }
}
