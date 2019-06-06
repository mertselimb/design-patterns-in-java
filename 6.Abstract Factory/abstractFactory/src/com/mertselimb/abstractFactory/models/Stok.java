package com.mertselimb.abstractFactory.models;
import java.time.LocalDate;

public class Stok {
    private int ID;
    private int stok_sayi;
    private LocalDate son_guncelleme;
    private Kitap kitap;

    public Stok(int ID, int stok_sayi,  Kitap kitap) {
        this.ID = ID;
        this.stok_sayi = stok_sayi;
        this.son_guncelleme = LocalDate.now();
        this.kitap = kitap;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
        this.son_guncelleme = LocalDate.now();
    }

    public int getStok_sayi() {
        return stok_sayi;
    }

    public void setStok_sayi(int stok_sayi) {
        this.stok_sayi = stok_sayi;
        this.son_guncelleme = LocalDate.now();
    }

    public LocalDate getSon_guncelleme() {
        return son_guncelleme;
    }

    public Kitap getKitap() {
        return this.kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
        this.son_guncelleme = LocalDate.now();
    }
}
