package com.tpo.github.uno.model.card;

import com.tpo.github.uno.model.UnoColor;
import com.tpo.github.uno.model.action.UnoAction;

import java.util.List;
import java.util.Optional;

public interface UnoCard {

    Optional<UnoColor> getColor();

    Integer getValue();

    List<UnoAction> getActions();
}
