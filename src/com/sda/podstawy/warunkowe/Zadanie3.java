package com.sda.podstawy.warunkowe;

import java.util.Scanner;

public class Zadanie3 {
    //wczytaj cyfre od 0 do 9 i wypisz
    //znak specjalny ! @ # $ % ^ & * ( ) który jest
    //pod tą cyfra na klawiaturze
    //obsluz przypadek, w ktorym podana liczba nie jest
    // pojedyncza cyfra, albo jest ujemna
    public static void main(String[] args) {
        //wczytywanie
        Scanner input = new Scanner(System.in);
        System.out.println("podaj liczbe znaku");
        int cyfra = input.nextInt();

        //switch case
        switch (cyfra){
            case 0: {
                System.out.println(")");
                break;
            }
            case 9: {
                System.out.println("(");
                break;
            }
            case 8: {
                System.out.println("*");
                break;
            }
            case 7: {
                System.out.println("&");
                break;
            }
            case 6: {
                System.out.println("^");
                break;
            }
            case 5: {
                System.out.println("%");
                break;
            }
            case 4: {
                System.out.println("$");
                break;
            }
            case 3: {
                System.out.println("#");
                break;
            }
            case 2: {
                System.out.println("@");
                break;
            }
            case 1: {
                System.out.println("!");
                break;
            }
            default:{
                System.out.println("to nie jest cyfra");
                break;
            }
        }
    }
}
