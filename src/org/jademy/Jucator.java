package org.jademy;

import java.util.*;

public class Jucator {
    private String name;
    private List<Localitate> listaLocalitati;

    public Jucator(String name) {
        this.listaLocalitati = new ArrayList<>();
        this.name = name;
    }

    public void display() {

        Iterator<Localitate> itr = listaLocalitati.iterator();
        while (itr.hasNext()) {
            Localitate listaLocalitati = itr.next();
            System.out.print(listaLocalitati.getName()+" ");
        }
        System.out.println();
    }
    public void setareLista(Oras o1, Oras o2, Oras o3, Resedinta r1, Resedinta r2, Resedinta r3, Resedinta r4) {
        listaLocalitati.add(o1);
        listaLocalitati.add(o2);
        listaLocalitati.add(o3);
        listaLocalitati.add(r1);
        listaLocalitati.add(r2);
        listaLocalitati.add(r3);
        listaLocalitati.add(r4);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Localitate> getListaLocalitati() {
        return listaLocalitati;
    }

    public void setListaLocalitati(List<Localitate> listaLocalitati) {
        this.listaLocalitati = listaLocalitati;
    }


    }



