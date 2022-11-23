package org.example;


//Each card has:
// a Suit (Club, Diamond, Heart, Spade) DONE
// a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A) DONE
// an int value (2,3,4,5,6,7,8,9,10,11,12,13,14) NEED TO ATTACH A VALUE TO EACH CARD


public class Card {
    public static void main(String[] args) {

        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] SYMBOLS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        int[] VALUE = { 2,3,4,5,6,7,8,9,10,11,12,13,14 };


        // create the deck

        int amount = SUITS.length * SYMBOLS.length; //(4suits * 13symbols = 52)

        String[] deckOfCards = new String[amount];

        for (int i = 0; i < SYMBOLS.length; i++) {  //for each one of the 13 SYMBOLS I need:

            for (int i2 = 0; i2 < SUITS.length; i2++) { //all the 4 different variations based on suits

                deckOfCards[SUITS.length * i + i2] = SYMBOLS[i] + "_of_" + SUITS[i2]; //e.g 7_of_Hearts
            }
        }

        // randomise

        for (int i = 0; i < amount; i++) {
            int random = i + (int) (Math.random() * (amount-i));
            String order = deckOfCards[random];
            deckOfCards[random] = deckOfCards[i];
            deckOfCards[i] = order;
        }

        // display all cards & deck length

        for (int i = 0; i < amount; i++) {
            System.out.println(deckOfCards[i]);
        }
        System.out.println(deckOfCards.length);
    }

}
