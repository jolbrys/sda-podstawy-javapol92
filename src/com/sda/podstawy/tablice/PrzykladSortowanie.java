package com.sda.podstawy.tablice;

import java.util.Arrays;

public class PrzykladSortowanie {
    public static void main(String[] args) {

        int[] tablica = {8, 4, 1, 25, 3, 26};
        int[][] tablica2d = {{4, 2, 3}, {9, 8, 1}, {5, 3, 2}};

        System.out.println("tablica przed sortowaniem: ");
        for (int e : tablica) {
            System.out.print(e + " ");
        }

        Arrays.sort(tablica);
        System.out.println("\ntablica po sortowaniu: ");
        for (int e : tablica) {
            System.out.print(e + " ");
        }
    }
}
