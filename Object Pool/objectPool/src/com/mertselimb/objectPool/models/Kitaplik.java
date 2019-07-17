package com.mertselimb.objectPool.models;

import com.mertselimb.objectPool.resources.KitapType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kitaplik {
    private List<Kitap> raf = new ArrayList<>();
    private KitapFactory basimEvi = new KitapFactory();
    private Random rand = new Random();

    public List<Kitap> getRaf() {
        return raf;
    }

    public void rafiDoldur(int havuzBoyutu){
        for (int j = 0; j < havuzBoyutu; j++) {
            raf.add(basimEvi.kitapUret(rand.nextInt(1000), "comolokko", LocalDate.now(),1000,1500,"comolokko?", KitapType.KITAP));
        }
    }


}
