//Just notes- not to be taken into account

//public class Notes {

    //2 modes? (end when deck is empty?) DONE
    //CardGame (abstract class?) DONE
    //change card display info DONE

//switch (card.getSuit()) {
//        case SPADE:
//            suits.append((char)'\u2660');
//            break;
//        case DIAMOND:
//            suits.append((char)'\u2666');
//            break;
//        case CLUB:
//            suits.append((char)'\u2663');
//            break;
//        case HEART:
//            suits.append((char)'\u2764');
//            break;
    //  SNAP CARD GAME

    //share the deck of cards

    //flip the card on top of the deck

    //snap(??)

    //collect cards(?)


    //NOTES

    //52 cards. 2 players -> 26 random cards each(?)


//}
//    String[] SUITS = {
//            "Clubs", "Diamonds", "Hearts", "Spades" (need to replace with Unicode)
//    };
//
//    String[] SYMBOLS = {
//            "2", "3", "4", "5", "6", "7", "8", "9", "10",
//            "Jack", "Queen", "King", "Ace"};

//    int[] VALUE = { 2,3,4,5,6,7,8,9,10,11,12,13,14 };


    // create the deck

//    int amount = SUITS.length * SYMBOLS.length; //(4suits * 13symbols = 52)

//    String[] deckOfCards = new String[amount];
//
//
//        for (int i = 0; i < SYMBOLS.length; i++) {  //for each one of the 13 SYMBOLS I need:
//
//        for (int i2 = 0; i2 < SUITS.length; i2++) { //all the 4 different variations based on suits
//
//        deckOfCards[SUITS.length * i + i2] = SYMBOLS[i] + "_of_" + SUITS[i2]; //e.g 7_of_Hearts
//        }
//        }
//
//        // randomise
//
//        for (int i = 0; i < amount; i++) {
//        double randomDouble = Math.random();
//        int random = i + (int) ( randomDouble * (amount-i));
//        String order = deckOfCards[random];
//        deckOfCards[random] = deckOfCards[i];
//        deckOfCards[i] = order;
//        }
//
//        // display all cards & deck length
//
//        for (int i = 0; i < amount; i++) {
//        System.out.println(deckOfCards[i]);
//        }
//        System.out.println("The amount of cards is: " + deckOfCards.length);
//
//        }
//
//}
