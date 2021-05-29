package com.sda.podstawy.petle;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        //wypisz liczby od 0 do 10 w petli for
        //drugie zadanie: zsumuj liczby od 1 do 10 w petli
        //trzecie zadanie: wczytaj od uzytkownika liczbe do ktorej chcesz sumowac

        System.out.println("podaj zakres");
        Scanner input = new Scanner(System.in);
        int liczba_dol =  1; //input.nextInt();
        int liczba_gora = 5; // input.nextInt();

        int suma = 0;
        for(int i = liczba_dol; i <= liczba_gora; i++){
            suma = suma + i;
        }
        System.out.println("wynik: " + suma);

    }
}
