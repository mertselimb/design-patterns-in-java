package com.mertselimb.singleton;

import com.mertselimb.singleton.models.Stoklar;

public class Main {

    public static void main(String[] args) {
        Stoklar ornek = Stoklar.ornekAL();
        Stoklar ornek1 = Stoklar.ornekAL();
        System.out.println(ornek);
        System.out.println(ornek1);
    }
}
