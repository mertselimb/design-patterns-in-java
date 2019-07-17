package com.mertselimb.mediator.models;

public class TanitEmri implements Emir{

    private Mediator med;

    public TanitEmri(Mediator med) {
        this.med = med;
    }

    @Override
    public void uygula() {
        med.herkesTanit();
    }
}
