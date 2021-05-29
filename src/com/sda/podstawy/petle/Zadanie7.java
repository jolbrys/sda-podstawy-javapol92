package com.sda.podstawy.petle;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        String produkt;
        String lista_zakupow = "";

        while (i < 3) {
            System.out.println("podaj produkt");
            produkt = input.next();
            System.out.println("dodano " + produkt + " do koszyka");
            System.out.println();
            lista_zakupow = lista_zakupow + produkt + " ";
            i++;
        }
        System.out.println("lista zakupow: " + lista_zakupow);
    }
}
