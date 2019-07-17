package com.mertselimb.abstractFactory.models;

import com.mertselimb.abstractFactory.resources.FactoryType;
import com.mertselimb.abstractFactory.resources.KitapType;

import java.time.LocalDate;

public abstract class AbstractFactory {

    public static AbstractFactory fabrikaSec(FactoryType type){
        switch (type){
            case KITAP:{
                return  new KitapFactory();
            }
            default:{
                //Kodun bu kısmı mock
                return  new KitapFactory();
            }
        }
    }

    public abstract Kitap kitapUret(int i, String comolokko, LocalDate now, int i1, int i2, String s, KitapType kitap);
}
