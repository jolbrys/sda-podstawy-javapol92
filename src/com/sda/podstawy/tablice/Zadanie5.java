package com.sda.podstawy.tablice;

public class Zadanie5 {
    public static void main(String[] args) {
        //zrob dwie tablice dwuwymiarowe
        //usun (tzn zamien na zero) wartosci w pierwszej tablicy
        //ktore sa takie same jak w drugiej
        //no i na koniec wydrukuj ta pierwsza

        int[][] tablica1 = {{1, 3, 4}, {4, 6, 2}, {5, 3, 1}};
        int[][] tablica2 = {{2, 6, 4}, {4, 1, 2}, {6, 3, 9}};


        //obliczanie
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablica1[i][j] == tablica2[i][j]) {
                    tablica1[i][j] = 0;
                }
            }
        }


        //       drukowanie tablicy wynikowej
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablica1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
