package com.engeto.examples;

import java.time.LocalDate;

public class Rezervace {
    String name;
    int pokoj;
    LocalDate odkdy;
    LocalDate dokdy;

    public Rezervace(String name, int pokoj, LocalDate odkdy, LocalDate dokdy) {
        this.name = name;
        this.pokoj = pokoj;
        this.odkdy = odkdy;
        this.dokdy = dokdy;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPokoj() {
        return pokoj;
    }

    public void setPokoj(int pokoj) {
        this.pokoj = pokoj;
    }

    public LocalDate getOdkdy() {
        return odkdy;
    }

    public void setOdkdy(LocalDate odkdy) {
        this.odkdy = odkdy;
    }

    public LocalDate getDokdy() {
        return dokdy;
    }

    public void setDokdy(LocalDate dokdy) {
        this.dokdy = dokdy;
    }

}
