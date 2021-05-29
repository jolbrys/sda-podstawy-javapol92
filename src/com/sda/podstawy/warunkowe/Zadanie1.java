package com.sda.podstawy.warunkowe;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        //sprawdz czy zadana liczba (int) jest mniejsza czy wieksza od 10

        //zczytywanie
        Scanner input = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int number = input.nextInt();

        //porownanie + wypisanie
        if (number > 10){
            System.out.println("liczba jest wieksza od 10");
        }
        else if (number < 10){
            System.out.println("liczba jest mniejsza od 10");
        } else {
            System.out.println("liczba jest rowna 10");
        }
    }
}
