package com.company;
import java.util.*;
import java.lang.System;
/**
 * Created by Frank on 9/26/2014.
 */
public class Deck {
    private List<Card> cards;
    private int topCardIndex;

    public Deck() {
        cards = new ArrayList<Card>();
        int numberOfCard = 52;
        for(int suit = 0; suit <= 3; suit++){
            for(int value = 1; value <= 13; value++){
                cards.add(new Card(value, suit));
                numberOfCard++;
            }
        }

        topCardIndex = 0;
    }

    public List<Card> deal(int numCards) {
        int currentSize;
        List<Card> drawnCards;

        drawnCards = new ArrayList<Card>(numCards);
        currentSize = cards.size();

        if (currentSize < numCards)
            numCards = currentSize;

        for(int index = 0; index < numCards; index++) {
            drawnCards.add(cards.remove(0));
        }
        return drawnCards;
    }

    // Using to show the content of a Deck
    public List<Card> getCurrentDeck(int numCards){
        int currentSize;
        List<Card> drawnCards = new ArrayList<Card>(numCards);
        currentSize = cards.size();

        if (currentSize < numCards)
            numCards = currentSize;

        for(int index = 0; index < numCards; index++) {
            drawnCards.add(cards.get(index));
        }
        return drawnCards;
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }
}
