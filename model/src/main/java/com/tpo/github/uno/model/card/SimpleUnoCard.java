package com.tpo.github.uno.model.card;

import com.tpo.github.uno.model.UnoColor;
import com.tpo.github.uno.model.action.DoNothingUnoAction;

public class SimpleUnoCard extends BasicUnoCard{


    public SimpleUnoCard(UnoColor color, Integer value) {
        super(color, value, new DoNothingUnoAction());
    }
}
