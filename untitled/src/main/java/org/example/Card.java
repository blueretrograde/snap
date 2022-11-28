package org.example;


//Each card has:
// a Suit (Club, Diamond, Heart, Spade) DONE
// a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A) DONE
// an int value (2,3,4,5,6,7,8,9,10,11,12,13,14) NEED TO ATTACH A VALUE TO EACH CARD


import java.util.Objects;

public class Card {
    private String suit;
    private String symbol;
    private int value;

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
//        return "Card{" +
//                "suit='" + suit + '\'' +
//                ", symbol='" + symbol + '\'' +
//                ", value=" + value +
//                "}\n";

       return "You have drawn " + symbol + " of " + suit; //value not needed(?)
    }


    public boolean hasSameSymbol(Card other) {
        return Objects.equals(this.symbol, other.symbol);
    }
}
