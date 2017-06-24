package com.tpo.github.uno.model.deck;

import com.tpo.github.uno.model.UnoColor;
import com.tpo.github.uno.model.action.ReverseUnoAction;
import com.tpo.github.uno.model.action.SkipUnoAction;
import com.tpo.github.uno.model.action.TakeTwoUnoAction;
import com.tpo.github.uno.model.card.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FullDeck extends Deck {

    public FullDeck() {
        getCards().addAll(buildColoredCards());
//        Collections.shuffle(getCards());
    }

    private List<UnoCard> buildColoredCards() {
        ArrayList<UnoCard> coloredCards = new ArrayList<>();

        Stream.of(UnoColor.values())
                .map(this::buildNumberedCards)
                .peek(numberedCards -> System.out.println("Numbered cards " + numberedCards.size()))
                .forEach(coloredCards::addAll);

        Stream.of(UnoColor.values())
                .map(this::buildActionCards)
                .peek(actionCards -> System.out.println("Action cards " + actionCards.size()))
                .forEach(coloredCards::addAll);

        Stream.of(UnoColor.values())
                .map(color -> buildWildCards())
                .peek(wildCards -> System.out.println("Wild cards " + wildCards.size()))
                .forEach(coloredCards::addAll);


        return coloredCards;
    }

    private List<UnoCard> buildActionCards(UnoColor unoColor) {
        return Arrays.asList(
                new ActionUnoCard(new TakeTwoUnoAction(), unoColor),
                new ActionUnoCard(new TakeTwoUnoAction(), unoColor),
                new ActionUnoCard(new SkipUnoAction(), unoColor),
                new ActionUnoCard(new SkipUnoAction(), unoColor),
                new ActionUnoCard(new ReverseUnoAction(), unoColor),
                new ActionUnoCard(new ReverseUnoAction(), unoColor));
    }

    private List<UnoCard> buildWildCards() {
        return Arrays.asList(new WildUnoCard(), new WildDrawFourUnoCard());
    }

    private List<UnoCard> buildNumberedCards(UnoColor unoColor) {
        return IntStream.rangeClosed(-9, 9)
                .mapToObj(value -> new SimpleUnoCard(unoColor, Math.abs(value)))
                .collect(Collectors.toList());
    }
}
