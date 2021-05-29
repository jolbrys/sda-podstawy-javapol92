package com.sda.podstawy.warunkowe;

import java.util.Scanner;

public class Zadanie2a {
    //napisz program ktory sprawdza czy liczba jest parzysta
    public static void main(String[] args) {
        //zczytywanie
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();

        //warunki
        if(liczba%2 == 0){
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("liczba jest nieparzysta");
        }
    }
}
