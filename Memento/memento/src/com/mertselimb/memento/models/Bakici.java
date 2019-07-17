package com.mertselimb.memento.models;

import java.util.Stack;

public class Bakici {

    private Stack<KitapMemento> eskiKitaplar = new Stack<>();

    public void kaydet (Kitap kitap) {
        eskiKitaplar.push(kitap.kaydet());
    }

    public void geriDon(Kitap kitap) {
        kitap.geriDon(eskiKitaplar.pop());
    }
}
