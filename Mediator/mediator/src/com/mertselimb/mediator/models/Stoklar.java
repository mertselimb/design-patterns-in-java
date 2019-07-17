package com.mertselimb.mediator.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Stoklar implements Iterable<Stok> {
    private static Stoklar ornek = null;
    private List<Stok> liste = new ArrayList<>();

    public List<Stok> getListe() {
        return this.liste;
    }

    public void setListe(List<Stok> liste) {
        this.liste = liste;
    }

    public void ekle(Stok s) {
        liste.add(s);
    }


    public static Stoklar ornekAL() {
        if (ornek == null) {
            ornek = new Stoklar();
        }
        return ornek;
    }

    @Override
    public Iterator iterator() {
        Iterator<Stok> it = new Iterator<Stok>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < liste.size() && liste.get(currentIndex) != null;
            }

            public Stok next() {
                return liste.get(currentIndex++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        return it;
    }

}
