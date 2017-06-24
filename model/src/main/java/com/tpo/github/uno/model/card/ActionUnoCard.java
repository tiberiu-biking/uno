package com.tpo.github.uno.model.card;

import com.tpo.github.uno.model.UnoColor;
import com.tpo.github.uno.model.action.UnoAction;

public class ActionUnoCard extends BasicUnoCard {

    public ActionUnoCard(UnoAction action, UnoColor unoColor) {
        super(unoColor, 20, action);
    }
}
