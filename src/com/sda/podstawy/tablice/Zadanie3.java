package com.sda.podstawy.tablice;

public class Zadanie3 {
    //stworzyc jakas tam tablice i przepisac ja do drugiej tablicy
    // * to samo tylko w drugiej tablicy w odwrotnej kolejnosci
    public static void main(String[] args) {
        int[] tablica1 = {12, 43, 123, 64, 78, 32, 45};
        int[] tablica2 = new int[7];

        for(int i = 1; i < tablica2.length; i++){
            tablica2[i] = tablica1[tablica1.length - i];
        }

        //alternatywne rozwiazanie
        /*
        tablica2 = new int[7];
        for (int i = tablica2.length; i >= 1; i--){
            tablica2[tablica2.length - i] = tablica1[i-1];
        }
        */

        //drukowanie
        for(int element : tablica2){
            System.out.print(element + " ");
        }
    }
}
