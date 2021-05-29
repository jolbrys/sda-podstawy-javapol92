package com.sda.podstawy.wstep;

import java.util.Scanner;

public class Zadanie4 {
    //napisz program ktory
    //  1. zczytuje od uzytkownika dystans i czas jego pokonania
    // podpowiedz: czas wczytajcie jako 3 zmienne typu liczbowego
    //  oddzielna dla godzin, minut i sekund
    //  2. a nastepnie podaje predkosc wyrazona w
    //      - metrach na sekunde
    //      - metrach na godzine
    //      - milach na godzine
    //
    //przyjmij ze 1 mila to 1609 metrow
    public static void main(String[] args) {
        //zczytywanie
        Scanner input = new Scanner(System.in);

        System.out.println("podaj dystans w metrach");
        double dystans = input.nextDouble();

        System.out.println("podaj czas przejscia - godziny, minuty i sekundy");
        int godziny = input.nextInt();
        int minuty = input.nextInt();
        int sekundy = input.nextInt();


        //obliczenia
        //metry na sekunde, m na godzine, mile na godzine
        double suma_sekund = sekundy + 60 * minuty + 3600 * godziny;
        double suma_godzin = suma_sekund/3600;

        double metryNaSekunde = dystans / suma_sekund;
        double metryNaGodzine = dystans / suma_godzin;
        double mileNaGodzine = dystans/1609/suma_godzin;

        //drukowanie wynik
        System.out.println("metry na sekunde: " + metryNaSekunde);
        System.out.println("metry na godzine: " + metryNaGodzine);
        System.out.println("mile na godzine: " + mileNaGodzine);

    }
}
