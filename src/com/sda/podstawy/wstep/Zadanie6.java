package com.sda.podstawy.wstep;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        //zczytaj 2 liczby i wydrukuj ich sume,
        //roznice, iloczyn, iloraz

        //*uzyj funkcji z klasy Math zeby wypisac potege
        //(tzn pierwsza liczba do drugiej) i pierwiastek(analogicznie)
        //podpowiedz: nie ma oddzielnej metody na pierwiastek dowolnego
        //stopnia.

        //zczytywanie
        Scanner input = new Scanner(System.in);

        System.out.println("podaj 2 liczby");
        double a = input.nextDouble();
        double b = input.nextDouble();


        //obliczenia
        double suma = a + b;
        double roznica = a - b;
        double iloczyn = a * b;
        double iloraz = a / b;
        double potega = Math.pow(a, b);
        double pierwiastek = Math.pow(a, 1/b);


        //drukowanie
        System.out.println("suma: " + suma);
        System.out.println("roznica: " + roznica);
        System.out.println("iloczyn: " + iloczyn);
        System.out.println("iloraz: " + iloraz);
        System.out.println("potega: " + potega);
        System.out.println("pierwiastek: " + pierwiastek);
    }
}
