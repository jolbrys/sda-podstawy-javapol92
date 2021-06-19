package com.sda.dalsze.statiki.kalkulator;

import java.util.Scanner;

public class Kalkulator {
    private static String znak;
    private static double a;
    private static double b;


    private static double oblicz(){
        double wynik;
        switch (znak){
            case "+": {
                wynik = Dzialania.dodawanie(a, b);
                break;
            }
            case "-": {
                wynik = Dzialania.odejmowanie(a, b);
                break;
            }
            case "*": {
                wynik = Dzialania.mnozenie(a, b);
                break;
            }
            case  "/": {
                wynik = Dzialania.dzielenie(a, b);
                break;
            }
            case "%": {
                wynik = Dzialania.modulo(a, b);
                break;
            }
            default: {
                wynik = 0;
                System.out.println("wrong sign");
            }
        }
        return wynik;
    }

    private static void zczytajDane(){
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        System.out.println("A teraz podaj znak: ");

        Kalkulator.znak = input.next();
    }

    private static void drukujDane(){
        System.out.println("dokonuje obliczen");
        System.out.println(oblicz());
        System.out.println("Gratulacje! pozdrawiam.");
    }

    public static void kalkulatorMethod(){
        zczytajDane();
        drukujDane();
    }

}
