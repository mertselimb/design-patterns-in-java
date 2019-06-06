package com.mertselimb.decorator;

import com.mertselimb.decorator.models.EKitapDecorator;
import com.mertselimb.decorator.models.Kitap;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap(1, "comolokko", LocalDate.now(), 1000, 1500, "comolokko?");
        EKitapDecorator eKitapDecorator = new EKitapDecorator(kitap1, "sadfasdfasd");

        System.out.println(eKitapDecorator.getUlasimUrl());
    }
}
