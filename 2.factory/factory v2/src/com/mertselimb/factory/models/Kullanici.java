package com.mertselimb.factory.models;
public class Kullanici {
    private int ID;
    private String kullanici_adi;
    private String sifre_hash;
    private String email;


    public void setID(int ID) {
        this.ID = ID;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public void setSifre_hash(String sifre_hash) {
        this.sifre_hash = sifre_hash;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public String getSifre_hash() {
        return sifre_hash;
    }

    public String getEmail() {
        return email;
    }

    public Kullanici(int ID, String kullanici_adi, String sifre_hash, String email) {
        this.ID = ID;
        this.kullanici_adi = kullanici_adi;
        this.sifre_hash = sifre_hash;
        this.email = email;
    }



}
