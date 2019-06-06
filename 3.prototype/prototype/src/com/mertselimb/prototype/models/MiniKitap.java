package com.mertselimb.prototype.models;

import java.time.LocalDate;

public class MiniKitap extends Kitap {
    private String tip = "MiniKitap";
    private int ozelBasimSayisi = -1;

    public MiniKitap(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim) {
        super(ID,isim,cikis_tarihi,basim,basim_sayisi,tanitim);
    }

    public MiniKitap(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim, int getOzelBasimSayisi) {
        super(ID,isim,cikis_tarihi,basim,basim_sayisi,tanitim);
        this.ozelBasimSayisi = getOzelBasimSayisi;

    }

    public String getTip() {
        return tip;
    }

    public int getOzelBasimSayisi() {
        return ozelBasimSayisi;
    }

    public void setOzelBasimSayisi(int ozelBasimSayisi) {
        this.ozelBasimSayisi = ozelBasimSayisi;
    }
}
