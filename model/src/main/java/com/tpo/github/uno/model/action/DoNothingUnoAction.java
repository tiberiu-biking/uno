package com.tpo.github.uno.model.action;

import com.tpo.github.uno.model.effect.NoEffect;
import com.tpo.github.uno.model.effect.UnoActionEffect;

public class DoNothingUnoAction implements UnoAction {

    @Override
    public UnoActionEffect play() {
        return new NoEffect();
    }
}
