package com.sda.podstawy.tablice;

import java.util.Random;
import java.util.Scanner;

public class Zadanie2b {
    //2. napisz program, ktory znajduje indeks
//liczby podanej przez uzytkownika
//albo jesli jej nie ma, niech wypisze stosowna informacje
    public static void main(String[] args) {
        Random r = new Random();
        int[] tablica = new int[150];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = r.nextInt(100);
        }

        System.out.println("podaj liczbe");
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        int flaga = 0;

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == liczba) {
                flaga = i;
                System.out.println("liczba " + liczba + " na pozycji " + i);
            }
        }

        if (flaga == 0) {
            System.out.println("liczby nie ma w tablicy");
        }
    }
}

