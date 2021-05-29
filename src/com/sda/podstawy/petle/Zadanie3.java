package com.sda.podstawy.petle;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        //stworz petle ktora wykona 5 iteracji
        //wewnatrz petli pobiera inty i sumuje je
        //po wyjsciu z petli wypisz sume
        Scanner input = new Scanner(System.in);

        int suma = 0;
        for(int i = 0; i < 5; i++) {
            int liczba = input.nextInt();
            suma = suma + liczba;
        }

        System.out.println(suma);

    }
}
