package com.mertselimb.observer.models;

import java.time.LocalDate;

public class MiniKitap extends Kitap {
    private int ozelBasimSayisi;

    public MiniKitap(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim, int getOzelBasimSayisi) {
        super(ID,isim,cikis_tarihi,basim,basim_sayisi,tanitim);
        this.ozelBasimSayisi = getOzelBasimSayisi;

    }

    public int getOzelBasimSayisi() {
        return ozelBasimSayisi;
    }

    public void setOzelBasimSayisi(int ozelBasimSayisi) {
        this.ozelBasimSayisi = ozelBasimSayisi;
    }
}
