package com.sda.podstawy.warunkowe;

import java.util.Scanner;

public class NotatkaSwitch {
    public static void main(String[] args) {
        //wczytywanie
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = input.nextInt();

        //sprawdzanie
        switch (liczba){
            case 10: {
                System.out.println("Liczba to 10");
                break;
            }
            case 100: {
                System.out.println("Liczba to 100");
                break;
            }
            case 50: {
                System.out.println("Liczba to 50");
                break;
            }
            default: {
                System.out.println("Liczba jest jakas dziwna");
                break;
            }
        }

        System.out.println("Koniec, jestesmy za switchem");
    }
}
