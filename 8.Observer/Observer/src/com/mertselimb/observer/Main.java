package com.mertselimb.observer;

import com.mertselimb.observer.models.Denek;
import com.mertselimb.observer.models.Kitap;
import com.mertselimb.observer.models.KitapObserver;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Denek kitap = new Kitap(1, "comolokko", LocalDate.now(), 1000, 1500, "comolokko?");

        KitapObserver kitapObserver = new KitapObserver(kitap);
        kitapObserver.addMessage("yetişecek mi acaba?");
    }
}
