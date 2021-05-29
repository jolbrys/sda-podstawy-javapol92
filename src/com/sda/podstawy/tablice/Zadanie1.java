package com.sda.podstawy.tablice;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
/*      1. Utwórz tablicę przechowującą wartości typu int o rozmiarze
    podanym przez użytkownika.
            a)Wypełnij ją losowymi wartościami
    wewnątrz pętli for.
    a) wydrukuj sumę i średnią tych wartości.
    b) Wypisz tylko liczby parzyste
   */

        Scanner input = new Scanner(System.in);
//        Random r = new Random();
        System.out.println("podaj dlugosc tablicy");
        int dlugosc = input.nextInt();

        int[] tablica = new int[dlugosc];

        for(int i = 0; i < tablica.length; i++){
            tablica[i] = input.nextInt();
        }

        int suma = 0;

        for(int element : tablica){
            if(element % 2 == 0) {
                System.out.println(element);
            }
            suma += element;
        }
        System.out.println("suma: " + suma);
        System.out.println("srednia: " + suma/tablica.length);
    }
}
