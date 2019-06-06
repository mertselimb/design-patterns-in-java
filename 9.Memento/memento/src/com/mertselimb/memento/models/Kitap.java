package com.mertselimb.memento.models;

import java.time.LocalDate;

public class Kitap {
    private int ID;
    private String isim;
    private LocalDate cikis_tarihi;
    private int basim;
    private int basim_sayisi;
    private String tanitim;

    public Kitap(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim) {
        this.ID = ID;
        this.isim = isim;
        this.cikis_tarihi = cikis_tarihi;
        this.basim = basim;
        this.basim_sayisi = basim_sayisi;
        this.tanitim = tanitim;
    }

    public KitapMemento kaydet() {
        return new KitapMemento(ID, isim, cikis_tarihi, basim, basim_sayisi, tanitim);
    }

    public void geriDon(KitapMemento kitap) {
        this.ID = kitap.getID();
        this.isim = kitap.getIsim();
        this.cikis_tarihi = kitap.getCikis_tarihi();
        this.basim = kitap.getBasim();
        this.basim_sayisi = kitap.getBasim_sayisi();
        this.tanitim = kitap.getTanitim();
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
