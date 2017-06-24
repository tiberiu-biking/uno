package com.tpo.github.uno.model.deck;

import com.tpo.github.uno.model.card.UnoCard;

import java.util.LinkedList;
import java.util.Queue;

public class Deck {

    private Queue<UnoCard> cards;

    public Deck() {
        this.cards = new LinkedList<>();
    }

    public Queue<UnoCard> getCards() {
        return cards;
    }
}
