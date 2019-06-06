package com.mertselimb.prototype;

import com.mertselimb.prototype.models.Kitap;
import com.mertselimb.prototype.models.KitapFactory;
import com.mertselimb.prototype.resources.KitapType;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        KitapFactory basimEvi = new KitapFactory();
        Kitap a = basimEvi.kitapUret(1, "comolokko",LocalDate.now(),1000,1500,"comolokko?", KitapType.KITAP);
        Kitap b = basimEvi.kitapUret(2, "comolokko",LocalDate.now(),1001,1500,"comolokko?", KitapType.EKITAP);
        Kitap c = basimEvi.kitapUret(3, "comolokko", LocalDate.now(),1002,1500,"comolokko?", KitapType.MINIKITAP);
        // Protoype üretimi
        Kitap d = (Kitap)c.clone();
        d.setBasim(1003);
        Kitap e = (Kitap)c.clone();
        e.setBasim(1004);
        System.out.println(a.getTip());
        System.out.println(b.getTip());
        System.out.println(c.getTip());

        System.out.println(a.getBasim());
        System.out.println(b.getBasim());
        System.out.println(c.getBasim());
        System.out.println(d.getBasim());
        System.out.println(e.getBasim());
    }
}
