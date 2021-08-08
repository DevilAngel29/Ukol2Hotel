package com.engeto.examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    String hoste;

    Host adela = new Host(" Adela Malikova ", LocalDate.of(1993,3,13));
        System.out.println(adela.getName());
        System.out.println(adela.getBorn());

    Host jana = new Host(" Jana Dvorackova ", LocalDate.of(1995,5,5));
        System.out.println(jana.getName());
        System.out.println(jana.getBorn());

        System.out.println();

    String pokoj;


    Pokoj pokoj1 = new Pokoj(1,1, true, 1000);
        System.out.println(" Pokoj cislo: " +pokoj1.getPokoj());
        System.out.println(" Pocet luzek: " +pokoj1.getLuzko());
        System.out.println(" Cena za jednu noc: " +pokoj1.cena +" Kc");
        System.out.println(" Vyhled: " +true);

        System.out.println();

        Pokoj pokoj2 = new Pokoj(2,1, true, 1000);
        System.out.println(" Pokoj cislo: " +pokoj2.getPokoj());
        System.out.println(" Pocet luzek: " +pokoj2.getLuzko());
        System.out.println(" Cena za jednu noc: " +pokoj2.cena +" Kc");
        System.out.println(" Vyhled: " +true);

        System.out.println();

        Pokoj pokoj3 = new Pokoj(3,3, false, 2400);
        System.out.println(" Pokoj cislo: " +pokoj3.getPokoj());
        System.out.println(" Pocet luzek: " +pokoj3.getLuzko());
        System.out.println(" Cena za jednu noc: " +pokoj3.cena +" Kc");
        System.out.println(" Vyhled: " +false);

        System.out.println();

        String rezervace;

        Rezervace rezervace1 = new Rezervace("Adela Malikova", 1, LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26));

        System.out.println("Rezervace 1:");
        System.out.println(rezervace1.getName());
        System.out.println(" Pokoj cislo " +rezervace1.getPokoj());
        System.out.println(" Od " +rezervace1.getOdkdy());
        System.out.println(" do " +rezervace1.getDokdy());

        System.out.println();

        Rezervace rezervace2 = new Rezervace("Jana Dvorackova", 3, LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14));

        System.out.println("Rezervace 2:");
        System.out.println(rezervace1.getName()+ " a " +rezervace2.getName());
        System.out.println(" Pokoj cislo " +rezervace2.getPokoj());
        System.out.println(" Od " +rezervace2.getOdkdy());
        System.out.println(" do " +rezervace2.getDokdy());

        }

            

        }




}
