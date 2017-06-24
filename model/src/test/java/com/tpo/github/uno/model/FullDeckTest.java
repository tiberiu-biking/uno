package com.tpo.github.uno.model;

import com.tpo.github.uno.model.card.UnoCard;
import com.tpo.github.uno.model.deck.FullDeck;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class FullDeckTest {

    private FullDeck fullDeck;

    @Before
    public void setUp() throws Exception {
        fullDeck = new FullDeck();
    }

    @Test
    public void fullDeckShouldHaveAllCards() throws Exception {
        assertEquals("Full deck cards count", 108, fullDeck.getCards().size());
    }

    @Test
    public void fullDeckShouldHaveAllColoredCards() throws Exception {
        Arrays.stream(UnoColor.values()).forEach(this::testColoredCards);
    }

    private void testColoredCards(UnoColor unoColor) {
        List<UnoCard> colorCards = filterByColor(fullDeck, unoColor);

        assertEquals("Simple " + unoColor + " cards", 25, colorCards.size());
//        assertTrue("Do nothing action", colorCards.stream().allMatch(blueCard -> blueCard.getActions() instanceof DoNothingUnoAction));
    }

    private List<UnoCard> filterByColor(FullDeck fullDeck, UnoColor unoColor) {
        return fullDeck.getCards()
                    .stream()
                    .filter(unoCard -> unoCard.getColor().isPresent()  && unoCard.getColor().get().equals(unoColor))
                    .collect(Collectors.toList());
    }
}