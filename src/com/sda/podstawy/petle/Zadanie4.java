package com.sda.podstawy.petle;

import java.util.Scanner;

public class Zadanie4 {
    //napisz program ktory w petli for wypisuje kolejne liczby az do liczby ktora
    //na poczatku programu pobierzesz od uzytkownika
    //jesli liczba jest podzielna przez 3, zamiast niej niech wypisze słowo "Fizz"
    //jeśli liczba jest podzielna przez 5 niech wypisze słowo "Buzz"
    //jeśli liczba jest podzielna przez 3 oraz 5 niech wypisze słowo "FizzBuzz"
    //podpowiedz: jesli uzyjesz funkcji System.out.print zamiast println
    //jesli wewnatrz stringa chcesz przejsc do nastepnej linii uzyj takiego znaku: \n

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj gorny limit: ");
        int limit = scanner.nextInt();
        for (int i = 1; i <= limit; i++) {
            System.out.print("Liczba " + i + ": ");
            if (i % 3 == 0) {
                System.out.print("fizz");
            }
            if (i % 5 == 0) {
                System.out.print("buzz");
            }
            System.out.println();
        }
    }
}
