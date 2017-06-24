package com.tpo.github.uno.model.card;

import com.tpo.github.uno.model.action.PickColorUnoAction;
import com.tpo.github.uno.model.action.TakeFourUnoAction;

public class WildDrawFourUnoCard extends BasicUnoCard {

    public WildDrawFourUnoCard() {
        super(null, 50, new PickColorUnoAction(), new TakeFourUnoAction());
    }
}
