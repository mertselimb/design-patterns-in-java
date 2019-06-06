package com.mertselimb.iterator;

import com.mertselimb.iterator.models.Kitap;
import com.mertselimb.iterator.models.Stok;
import com.mertselimb.iterator.models.Stoklar;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Stoklar stoklar = Stoklar.ornekAL();

        Kitap kitap = new Kitap(1, "comolokko", LocalDate.now(), 1000, 1500, "comolokko?");
        Stok stok = new Stok(5, 500, kitap);
        stoklar.ekle(stok);
        stoklar.ekle(stok);
        stoklar.ekle(stok);
        stoklar.ekle(stok);
        stoklar.ekle(stok);
        stoklar.ekle(stok);

        for (Stok s : stoklar) {
            System.out.println(s.getKitap().getBasim());
        }

    }
}
