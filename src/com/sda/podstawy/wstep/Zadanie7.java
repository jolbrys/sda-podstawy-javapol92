package com.sda.podstawy.wstep;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        //zczytaj od uzytkownika imie i wiek
        //i wypisz tresc "czesc <imie>, masz <wiek> lat

        //zczytywanie
        Scanner input = new Scanner(System.in);

        System.out.println("podaj imie i wiek");
        String imie = input.next();

//        System.out.println("podaj wiek");
        int wiek = input.nextInt();

        //wypisywanie
        System.out.println("witaj, " + imie + " masz " + wiek + " lat");

    }
}
