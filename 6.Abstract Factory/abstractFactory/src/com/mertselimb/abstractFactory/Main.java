package com.mertselimb.abstractFactory;

import com.mertselimb.abstractFactory.models.AbstractFactory;
import com.mertselimb.abstractFactory.models.Kitap;
import com.mertselimb.abstractFactory.models.KitapFactory;
import com.mertselimb.abstractFactory.resources.FactoryType;
import com.mertselimb.abstractFactory.resources.KitapType;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        AbstractFactory basimEvi = AbstractFactory.fabrikaSec(FactoryType.KITAP);

        Kitap a = basimEvi.kitapUret(1, "comolokko",LocalDate.now(),1000,1500,"comolokko?", KitapType.KITAP);
        Kitap b = basimEvi.kitapUret(2, "comolokko",LocalDate.now(),1000,1500,"comolokko?", KitapType.EKITAP);
        Kitap c = basimEvi.kitapUret(3, "comolokko",LocalDate.now(),1000,1500,"comolokko?", KitapType.MINIKITAP);

        System.out.println(a.getTip());
        System.out.println(b.getTip());
        System.out.println(c.getTip());
    }
}
