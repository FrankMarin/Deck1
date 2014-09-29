package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deck cards;
        List<Card> hand, currentDeck;

       cards = new Deck();

        // Get current content of cards.
        currentDeck = cards.getCurrentDeck(52);
        for (int i = 0; i < currentDeck.size(); i++)
        {
            System.out.print(currentDeck.get(i).getImageFileName());
        }
        System.out.println();

        // Shuffle cards
        cards.shuffleCards();

        // Get current content of cards.
        currentDeck = cards.getCurrentDeck(52);
        for (int i = 0; i < currentDeck.size(); i++)
        {
            System.out.print(currentDeck.get(i).getImageFileName());
        }
        System.out.println();

        // Deal 5 cards
        hand = cards.deal(5);
        for (int i = 0; i < hand.size(); i++)
        {
            System.out.println(hand.get(i).getImageFileName());
        }
        System.out.println();
    }
}
