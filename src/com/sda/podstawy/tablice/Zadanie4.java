package com.sda.podstawy.tablice;

public class Zadanie4 {
    //stworz dwie tablice dwuwymiarowe i dodaj je do siebie (jak macierze)
    //(czyli odpowiadajace sobie pola)
    //podpowiedz: bedzie potrzebna 3 tablica wynikowa

    public static void main(String[] args) {

        //deklarowanie tablic
        int[][] tablica1 = {{1, 3, 4}, {4, 6, 2}, {5, 3, 1}};
        int[][] tablica2 = {{2, 6, 1}, {5, 1, 2}, {6, 9, 11}};

        //tablica wynikowa
        int[][] tablica3 = new int[3][3];

        //obliczanie
        for(int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                tablica3[i][j] = tablica1[i][j] + tablica2[i][j];
            }
        }


        //drukowanie tablicy wynikowej
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablica3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
