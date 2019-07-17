package com.mertselimb.prototype.models;

        import com.mertselimb.prototype.resources.KitapType;

        import java.time.LocalDate;

public class KitapFactory {
    public static Kitap kitapUret(int ID, String isim, LocalDate cikis_tarihi, int basim, int basim_sayisi, String tanitim, KitapType tip) {
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
