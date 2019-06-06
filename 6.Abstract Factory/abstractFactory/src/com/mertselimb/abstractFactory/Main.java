package com.mertselimb.abstractFactory;

import com.mertselimb.abstractFactory.models.Kitap;
import com.mertselimb.abstractFactory.resources.KitapType;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Kitap.Builder builder =  new Kitap.Builder();
        Random rand = new Random();
        builder.ID(rand.nextInt(1000)).isim("comolokko").cikis_tarihi(LocalDate.now()).basim(1000).basim_sayisi(1500).tanitim("comolokko?").tip(KitapType.KITAP);

        Kitap kitap = builder.build();
        System.out.println(kitap.getBasim());
    }
}
