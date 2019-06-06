package com.mertselimb.prototype.models;

import java.time.LocalDate;

public class Kitap implements Cloneable{
    private int ID;
    private String isim;
    private LocalDate cikis_tarihi;
    private int basim;
    private int basim_sayisi;
    private String tanitim;
    private String tip = "Kitap";

    public Kitap(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim) {
        this.ID = ID;
        this.isim = isim;
        this.cikis_tarihi = cikis_tarihi;
        this.basim = basim;
        this.basim_sayisi = basim_sayisi;
        this.tanitim = tanitim;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTip() {
        return tip;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public LocalDate getCikis_tarihi() {
        return cikis_tarihi;
    }

    public void setCikis_tarihi(LocalDate cikis_tarihi) {
        this.cikis_tarihi = cikis_tarihi;
    }

    public int getBasim() {
        return basim;
    }

    public void setBasim(int basim) {
        this.basim = basim;
    }

    public int getBasim_sayisi() {
        return basim_sayisi;
    }

    public void setBasim_sayisi(int basim_sayisi) {
        this.basim_sayisi = basim_sayisi;
    }

    public String getTanitim() {
        return tanitim;
    }

    public void setTanitim(String tanitim) {
        this.tanitim = tanitim;
    }
}
