package com.mertselimb.abstractFactory.models;
import java.util.ArrayList;
import java.util.List;

public class Stoklar {
    private static Stoklar ornek = null;
    private List<Stok> liste = new ArrayList<>();

    public List<Stok> getListe() {
        return this.liste;
    }

    public void setListe(List<Stok> liste) {
        this.liste = liste;
    }

    public void ekle(Stok s){
        liste.add(s);
    }


    public static Stoklar ornekAL(){
        if(ornek == null){
            ornek = new Stoklar();
        }
        return ornek;
    }
}
