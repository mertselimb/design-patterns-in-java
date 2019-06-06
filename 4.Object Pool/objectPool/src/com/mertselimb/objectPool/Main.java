package com.mertselimb.objectPool;

import com.mertselimb.objectPool.models.Kitap;
import com.mertselimb.objectPool.models.KitapFactory;
import com.mertselimb.objectPool.models.Kitaplik;
import com.mertselimb.objectPool.resources.KitapType;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Kitaplik kitaplik = new Kitaplik();
        kitaplik.rafiDoldur(250);
        System.out.println(kitaplik.getRaf().size());
    }
}
