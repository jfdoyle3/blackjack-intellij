package com.company.ui;

public class ErrorConsole {

    public static void errorBet(int chips) {
        System.out.printf("Invalid bet: You have %d chips. How much you want bet? ",chips);
    }
    public static void errorChoice() {
        System.out.println("Error! Hit assumed");
    }
}
