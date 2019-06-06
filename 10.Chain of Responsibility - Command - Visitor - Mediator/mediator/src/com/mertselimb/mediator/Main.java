package com.mertselimb.mediator;

import com.mertselimb.mediator.models.Emir;
import com.mertselimb.mediator.models.Kitap;
import com.mertselimb.mediator.models.Mediator;
import com.mertselimb.mediator.models.TanitEmri;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();
        Kitap kitap1 = new Kitap(1, "comolokko", LocalDate.now(), 1000, 1500, "comolokko?");
        Kitap kitap2 = new Kitap(1, "comolokko", LocalDate.now(), 1000, 1500, "comolokko?");
        Kitap kitap3 = new Kitap(1, "comolokko", LocalDate.now(), 1000, 1500, "comolokko?");
        Kitap kitap4 = new Kitap(1, "comolokko", LocalDate.now(), 1000, 1500, "comolokko?");

        mediator.kitapEkle(kitap1);
        mediator.kitapEkle(kitap2);
        mediator.kitapEkle(kitap3);
        mediator.kitapEkle(kitap4);

        Emir kendiniTanit = new TanitEmri(mediator);

        kendiniTanit.uygula();
    }
}
