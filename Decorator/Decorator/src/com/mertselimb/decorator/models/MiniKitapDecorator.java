package com.mertselimb.decorator.models;

public class MiniKitapDecorator {
    private int sayfa;
    public MiniKitapDecorator(int sayfa) {
        this.sayfa = sayfa;
    }

    public int getSayfa() {
        return sayfa;
    }

    public void setSayfa(int sayfa) {
        this.sayfa = sayfa;
    }
}
