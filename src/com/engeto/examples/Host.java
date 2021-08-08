package com.engeto.examples;

import java.time.LocalDate;

public class Host {
    //O každém hostu musíme uložit jméno, příjmení a datum narození.
    String name;
    LocalDate born;


    public Host(String name, LocalDate born) {
        this.name = name;
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }


}
