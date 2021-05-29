package com.sda.podstawy.petle;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        //wewnatrz petli while (iles razy) pobieraj produkt do kupienia
        //i wypisz na ekran w postaci "dodano X do koszyka"

        //zmienne potrzebne wewnatrz petli
        Scanner input = new Scanner(System.in);
        int i = 0;
        String produkt;

        while(i < 5){
            System.out.println("podaj produkt");
            produkt = input.next();
            System.out.println("dodano " + produkt + " do koszyka");
            System.out.println();
            i++;
        }
    }
}
