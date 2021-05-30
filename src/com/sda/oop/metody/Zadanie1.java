package com.sda.oop.metody;

public class Zadanie1 {
    public static void main(String[] args) {
        //napisz metode (void), ktora pobiera imie jako parametr String
        //i wypisuje "witaj, imie
        String mojeImie = "Jakub";
        wypiszImie(mojeImie);

        System.out.println("dzien dobry");

    }
    static void wypiszImie(String imie){
        System.out.println("Witaj, " + imie);
    }
}
