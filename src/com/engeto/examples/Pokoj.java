package com.engeto.examples;

public class Pokoj {
    //Hosty vždy ubytováváme na pokojích. Pokoj je identifikován svým číslem. O každém pokoji chceme evidovat,
    // kolik lůžek tam je (neřešte přistýlky apod.) a zda má pokoj balkón a
    // výhled na moře a jaká je cena pokoje za jednu noc (předpokládej,
    // že je cena pevně daná bez ohledu na sezónu a počet ubytovaných).
    int pokoj;
    int luzko;
    boolean vyhled;
    int cena;

    public Pokoj(int pokoj, int luzko, boolean vyhled, int cena) {
        this.pokoj = pokoj;
        this.luzko = luzko;
        this.vyhled = vyhled;
        this.cena = cena;
    }

    public int getPokoj() {
        return pokoj;
    }

    public void setPokoj(int pokoj) {
        this.pokoj = pokoj;
    }

    public int getLuzko() {
        return luzko;
    }

    public void setLuzko(int luzko) {
        this.luzko = luzko;
    }

    public boolean isVyhled() {
        return vyhled;
    }

    public void setVyhled(boolean vyhled) {
        this.vyhled = vyhled;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
