package org.example;
import java.util.ArrayList;

public abstract class CardGame {
    private static char[] SUITS = {'\u2764', '\u2663', '\u2666', '\u2660'};

    private static String[] SYMBOLS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K", "A"};

    private static int[] VALUE = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    private String name;

    private ArrayList<Card> deckOfCards;

    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = new ArrayList<>();
        // create the deck
        for (int i = 0; i < SYMBOLS.length; i++) {  //for each one of the 13 SYMBOLS I need:

            for (int i2 = 0; i2 < SUITS.length; i2++) { //all the 4 different variations based on suits
                Card card = new Card(String.valueOf(SUITS[i2]), SYMBOLS[i], VALUE[i]);
                deckOfCards.add(card);
            }
        }
    }

    public Card dealCard() {
        System.out.println("Dealt card: " + deckOfCards.get(0));
        return deckOfCards.remove(0);
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        ArrayList<Card> sortedCards = new ArrayList<>();
        for (int i = 0; i < SYMBOLS.length; i++) {  //for each one of the 13 SYMBOLS I need:
            for (int i2 = 0; i2 < SUITS.length; i2++) { //all the 4 different variations based on suits
                Card card = new Card(String.valueOf(SUITS[i2]), SYMBOLS[i], VALUE[i]);
                sortedCards.add(card);
            }
        }
        deckOfCards = sortedCards;
        System.out.println("Sorted deck in number order.");
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        ArrayList<Card> sortedCards = new ArrayList<>();
        for (int i2 = 0; i2 < SUITS.length; i2++) { //to sort into suits
            for (int i = 0; i < SYMBOLS.length; i++) {  //display all 13 cards of each suit
                Card card = new Card(String.valueOf(SUITS[i2]), SYMBOLS[i], VALUE[i]);
                sortedCards.add(card);
            }
        }
        deckOfCards = sortedCards;
        System.out.println("Sorted deck in suits order.");
        return deckOfCards;

    }

    public ArrayList<Card> shuffleDeck() {
        ArrayList<Card> newDeck = sortDeckInNumberOrder();
        int amount = newDeck.size();
        for (int i = 0; i < amount; i++) {
            double randomDouble = Math.random();
            int random = i + (int) (randomDouble * (amount - i));
            Card cardOnRandomPosition = newDeck.get(random);
            newDeck.set(random, newDeck.get(i));
            newDeck.set(i, cardOnRandomPosition);
        }
        this.deckOfCards = newDeck;
        System.out.println("--- Shuffled Deck ---");
        return deckOfCards;
    }

    public ArrayList<Card> getDeck() {
//        System.out.println(deckOfCards);
        return deckOfCards;
    }

//    public static void main(String[] args) {
//        CardGame cardGame = new CardGame("snap");
//        cardGame.shuffleDeck();
//        cardGame.sortDeckIntoSuits();
//    }
}
