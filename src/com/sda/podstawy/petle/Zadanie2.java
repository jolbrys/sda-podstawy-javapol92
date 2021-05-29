package com.sda.podstawy.petle;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        //wewnatrz petli for pobieraj 10 razy produkt w stringu
        // i wyswietlaj na ekran
        Scanner input = new Scanner(System.in);
        String produkt;

        for (int i = 0; i < 10; i++){
            produkt = input.next();
            System.out.println("dodano " + produkt + " do koszyka");
        }
    }
}
