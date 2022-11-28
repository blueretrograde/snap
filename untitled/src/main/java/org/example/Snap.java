package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    private static Scanner keyboard = new Scanner(System.in);

    public Snap() {
        super("snap");

    }

    public void playGame(boolean reshuffleOnEmptyDeck) {
        if (reshuffleOnEmptyDeck) {
            playGameReshuffleWhenDeckEmpty();
        } else {
            playGameEndWhenDeckEmpty();
        }
    }

    private void playGameReshuffleWhenDeckEmpty() {
        boolean playerWon = false;
        Card previousCard = null;
        shuffleDeck();
        while (!playerWon) {
            if (getDeck().size() == 0) {
                System.out.println("Deck size is zero");
                shuffleDeck();
                previousCard = null;
            }
            System.out.println("Press enter to draw a card.");
            keyboard.nextLine();
            Card dealtCard = dealCard();
            if (previousCard != null) {
                if (dealtCard.hasSameSymbol(previousCard)) {
                    System.out.println("You Win!");
                    playerWon = true;
                }
            }
            previousCard = dealtCard;
        }
        System.out.println("Game Over");
    }

    private void playGameEndWhenDeckEmpty() {
        boolean playerWon = false;
        Card previousCard = null;
        shuffleDeck();
        while (!playerWon) {
            if (getDeck().size() == 0) {
                System.out.println("No match found. Game Over");
                return;
            }
            System.out.println("Press enter to draw a card.");

            keyboard.nextLine();
            Card dealtCard = dealCard();
            if (previousCard != null) {
                if (dealtCard.hasSameSymbol(previousCard)) {
                    System.out.println("You Win!");
                    playerWon = true;
                }
            }
            previousCard = dealtCard;
        }
        System.out.println("Game Over");
    }

    public static void main(String[] args) {
        Snap snap = new Snap();
        System.out.println("Would you like to reshuffle/restart automatically when deck is empty? [yes/no]");
        String response = keyboard.nextLine();
        if ("yes".equals(response)) {
            System.out.println("Starting game with reshuffling on empty deck.\n");
            snap.playGame(true);
        } else {
            System.out.println("Starting game that will end on empty deck.\n");
            snap.playGame(false);
        }


    }
}
