package com.mertselimb.memento;

import com.mertselimb.memento.models.Bakici;
import com.mertselimb.memento.models.Kitap;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Kitap kitap = new Kitap(1, "comolokko", LocalDate.now(), 1000, 1500, "comolokko?");
        Bakici bakici = new Bakici();
        bakici.kaydet(kitap);

        kitap.setBasim(199999);
        System.out.println(kitap.getBasim());

        bakici.geriDon(kitap);

        System.out.println(kitap.getBasim());
    }
}
