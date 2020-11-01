package com.company;

public class Pracownik extends Osoba{
    protected final Stanowisko stanowisko;
    protected final double pensja;

    public Pracownik(String imie, String nazwisko, Stanowisko stanowisko, double pensja) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.stanowisko + " " + this.pensja;
    }
}
