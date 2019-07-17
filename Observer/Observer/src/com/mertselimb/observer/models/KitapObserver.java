package com.mertselimb.observer.models;

public class KitapObserver extends Observer {

    public KitapObserver(Denek denek){
        this.denek = denek;
        denek.attach(this);
    }

    public void addMessage(String message) {
        denek.setState(message);
    }

    @Override
    void update() {
        System.out.println(denek.getState());
    }
}
