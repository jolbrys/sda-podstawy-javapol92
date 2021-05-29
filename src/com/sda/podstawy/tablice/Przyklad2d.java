package com.sda.podstawy.tablice;

public class Przyklad2d {
    public static void main(String[] args) {
        int[][] tablica2d = {{1, 3, 4}, {4, 6, 2}, {5, 3, 1} };

        for(int[] subtablica : tablica2d){
            for(int element : subtablica){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(tablica2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
