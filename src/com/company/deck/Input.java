package com.company.deck;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner input=new Scanner(System.in);

    public static String inputStringText(String string) {
        System.out.print(string);
        return input.next();
    }
    public static int inputNumberText(String string) {
        System.out.print(string);
        return input.nextInt();
    }
    public static String inputString() {
        return input.next();
    }
    public static int inputNumber() {
        int choice=0;
        try {
            System.out.print("==>");
            choice = input.nextInt();
        } catch (InputMismatchException err) {
            System.out.println("Error: Input must be a number.");
            inputNumber();
        }

        return choice;
    }

}
