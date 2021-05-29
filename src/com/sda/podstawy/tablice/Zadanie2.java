package com.sda.podstawy.tablice;

import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        //1. napisz program ktory sprawdza czy podana przez uzytkownika
        //liczba znajduje sie w tablicy
        Random r = new Random();
        int[] tablica = new int[150];

        for(int i = 0; i < tablica.length; i++){
            tablica[i] = r.nextInt(100);
        }

        System.out.println("podaj liczbe");
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        boolean flag = false;

        for(int i = 0; i < tablica.length; i++ ){
            if(tablica[i] == liczba){
                flag = true;
            }
        }

        if(flag){
            System.out.println("liczba jest w tablicy ");
        }else{
            System.out.println("liczby nie ma w tablicy");
        }
    }
}

//2. napisz program, ktory znajduje indeks
//liczby podanej przez uzytkownika
//albo jesli jej nie ma, niech wypisze stosowna informacje

