package com.mertselimb.builder.models;

import com.mertselimb.builder.resources.KitapType;

import java.time.LocalDate;

public class Kitap {
    private final int ID;
    private final String isim;
    private final LocalDate cikis_tarihi;
    private final int basim;
    private final int basim_sayisi;
    private final String tanitim;
    private final String tip = "Kitap";

    public Kitap(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim) {
        this.ID = ID;
        this.isim = isim;
        this.cikis_tarihi = cikis_tarihi;
        this.basim = basim;
        this.basim_sayisi = basim_sayisi;
        this.tanitim = tanitim;
    }

    public static class Builder {
        private int ID;
        private String isim;
        private LocalDate cikis_tarihi;
        private int basim;
        private int basim_sayisi;
        private String tanitim;
        private String tip;

        public Builder() {

        }

        public Kitap build() {
            return new Kitap(this);
        }

        public Builder ID(int id) {
            this.ID = id;
            return this;
        }

        public Builder isim(String isim) {
            this.isim = isim;
            return this;
        }

        public Builder cikis_tarihi(LocalDate cikis_tarihi) {
            this.cikis_tarihi = cikis_tarihi;
            return this;
        }

        public Builder basim(int basim) {
            this.basim = basim;
            return this;
        }

        public Builder basim_sayisi(int basim_sayisi) {
            this.basim_sayisi = basim_sayisi;
            return this;
        }

        public Builder tanitim(String tanitim) {
            this.tanitim = tanitim;
            return this;
        }

        public Builder tip(KitapType tip) {
            this.tip = tip.toString();
            return this;
        }

    }


    public Kitap(Builder builder) {
        this.ID = builder.ID;
        this.isim = builder.isim;
        this.cikis_tarihi = builder.cikis_tarihi;
        this.basim = builder.basim;
        this.basim_sayisi = builder.basim_sayisi;
        this.tanitim = builder.tanitim;
    }


    public String getTip() {
        return tip;
    }

    public int getID() {
        return ID;
    }

    public String getIsim() {
        return isim;
    }

    public LocalDate getCikis_tarihi() {
        return cikis_tarihi;
    }

    public int getBasim() {
        return basim;
    }

    public int getBasim_sayisi() {
        return basim_sayisi;
    }

    public String getTanitim() {
        return tanitim;
    }

}
