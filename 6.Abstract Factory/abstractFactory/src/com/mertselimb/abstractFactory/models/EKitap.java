package com.mertselimb.abstractFactory.models;
import java.time.LocalDate;

public class EKitap extends Kitap{
    private String tip = "EKitap";
    private String ulasim_Url = "-1";

    public EKitap(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim) {
        super(ID,isim,cikis_tarihi,basim,basim_sayisi,tanitim);
    }

    public EKitap(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim, String ulasim_Url) {
        super(ID,isim,cikis_tarihi,basim,basim_sayisi,tanitim);
        this.ulasim_Url = ulasim_Url;
    }

    public String getTip() {
        return tip;
    }

    public String getUlasim_Url() {
        return ulasim_Url;
    }

    public void setUlasim_Url(String ulasim_Url) {
        this.ulasim_Url = ulasim_Url;
    }
}
