package com.mertselimb.mediator.models;

import java.time.LocalDate;

public class EKitap extends Kitap{

    private String ulasim_Url;

    public EKitap(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim, String ulasim_Url) {
        super(ID,isim,cikis_tarihi,basim,basim_sayisi,tanitim);
        this.ulasim_Url = ulasim_Url;
    }

    public String getUlasim_Url() {
        return ulasim_Url;
    }

    public void setUlasim_Url(String ulasim_Url) {
        this.ulasim_Url = ulasim_Url;
    }
}
