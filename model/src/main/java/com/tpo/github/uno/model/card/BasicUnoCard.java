package com.tpo.github.uno.model.card;

import com.tpo.github.uno.model.UnoColor;
import com.tpo.github.uno.model.action.UnoAction;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class BasicUnoCard implements UnoCard {

    private UnoColor color;
    private Integer value;
    private List<UnoAction> actions;

    public BasicUnoCard(UnoColor color, Integer value, UnoAction ... actions) {
        this.color = color;
        this.value = value;
        this.actions = Arrays.asList(actions);
    }

    @Override
    public Optional<UnoColor> getColor() {
        return Optional.ofNullable(color);
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public List<UnoAction> getActions() {
        return actions;
    }
}
