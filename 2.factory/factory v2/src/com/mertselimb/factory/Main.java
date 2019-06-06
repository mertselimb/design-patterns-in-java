package com.mertselimb.factory;

import com.mertselimb.factory.models.Kitap;
import com.mertselimb.factory.models.KitapFactory;
import com.mertselimb.factory.resources.KitapType;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        KitapFactory basimEvi = new KitapFactory();
        Kitap a = basimEvi.kitapUret(1, "comolokko",LocalDate.now(),1000,1500,"comolokko?", KitapType.KITAP);
        Kitap b = basimEvi.kitapUret(2, "comolokko",LocalDate.now(),1000,1500,"comolokko?", KitapType.EKITAP);
        Kitap c = basimEvi.kitapUret(3, "comolokko",LocalDate.now(),1000,1500,"comolokko?", KitapType.MINIKITAP);

        System.out.println(a.getTip());
        System.out.println(b.getTip());
        System.out.println(c.getTip());
    }
}
