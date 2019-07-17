package com.mertselimb.mediator.models;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Kitap> kitaplar = new ArrayList<>();

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void herkesTanit() {
        for (Kitap kitap : kitaplar) {
            kitap.tanit();
        }
    }
}
