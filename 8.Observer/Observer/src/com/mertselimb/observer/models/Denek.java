package com.mertselimb.observer.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Denek {

    private List<Observer> observers = new ArrayList<>();

    abstract void setState(String state);
    abstract String getState();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void ObserverlariUyar() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

