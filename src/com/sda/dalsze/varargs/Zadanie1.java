package com.sda.dalsze.varargs;

public class Zadanie1 {
    //wczytaj kilka zmiennych jako varargs,
    //zamien jednej z nich( np indeks 4) wartosc na 0 i wypisz wszystkie
    //Zadanie1b: to samo, tylko wyzeruj wszystkie elementy
    //Zadanie1c: znowu to samo, ale wyzeruj tylko jedynki

    public static void main(String[] args) {
        metoda1(11, 4, 1, 6, 89, 1, 7, 1);
        metoda2(11, 4, 1, 6, 89, 1, 7, 1);
    }

    private static void metoda1(int... zmienne) {
        zmienne[4] = 0;
        for (int e : zmienne) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    private static void metoda2(int... zmienne) {
        for (int e : zmienne) {
            e = 0;
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
