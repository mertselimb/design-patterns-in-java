package com.mertselimb.abstractFactory.models;

import com.mertselimb.abstractFactory.resources.KitapType;

import java.time.LocalDate;

public class KitapFactory extends AbstractFactory {

    @Override
    public Kitap kitapUret(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim, KitapType tip) {
        switch (tip){
            case EKITAP:{
                return new EKitap(ID,isim,cikis_tarihi,basim,basim_sayisi,tanitim);
            }
            case MINIKITAP:{
                return new MiniKitap(ID,isim,cikis_tarihi,basim,basim_sayisi,tanitim);
            }
            default: {
                return new Kitap(ID,isim,cikis_tarihi,basim,basim_sayisi,tanitim);
            }
        }

    }
}
