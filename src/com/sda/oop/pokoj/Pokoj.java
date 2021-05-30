package com.sda.oop.pokoj;

public class Pokoj {
    public Pokoj(double wysokosc, double szerokosc, double dlugosc){
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }
    public Pokoj(double szerokosc, double dlugosc){
        this.wysokosc = 0;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }

    private double wysokosc;
    private double szerokosc;
    private double dlugosc;
}
