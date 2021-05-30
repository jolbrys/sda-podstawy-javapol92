package com.sda.oop.metody;

import java.util.Scanner;

public class Zadanie3 {
    //napisz metode ktora sprawdza czy liczba(zadana ze scannera) jest parzysta
    //i zwroci informacje w type boolean

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int liczba = input.nextInt();
        if (sprawdzParzystosc(liczba)) {
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("liczba jest nieparzysta");
        }
    }

    static boolean sprawdzParzystosc(int liczba) {
//        if (liczba % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return liczba % 2 == 0;
    }
}
