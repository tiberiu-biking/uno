package com.tpo.github.uno.model.card;

import com.tpo.github.uno.model.action.PickColorUnoAction;

public class WildUnoCard extends BasicUnoCard {

    public WildUnoCard() {
        super(null, 50, new PickColorUnoAction());
    }
}
