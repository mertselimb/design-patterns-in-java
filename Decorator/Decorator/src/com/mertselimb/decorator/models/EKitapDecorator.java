package com.mertselimb.decorator.models;

public class EKitapDecorator {
    private  String ulasimUrl;
    public EKitapDecorator(Kitap kitap, String ulasimUrl) {
        this.ulasimUrl = ulasimUrl;
    }

    public String getUlasimUrl() {
        return ulasimUrl;
    }

    public void setUlasimUrl(String ulasimUrl) {
        this.ulasimUrl = ulasimUrl;
    }
}
