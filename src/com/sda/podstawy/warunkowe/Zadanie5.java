package com.sda.podstawy.warunkowe;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        // napisz kalkulator ktory
        // pobiera 2 liczby od uzytkownika
        // pobiera znak dzialania ( + - * / )
        //drukuje wynik
        // * dodaj mozliwosc potegowania i wyciagania pierwiastka
        //         //Math.pow(a, b) == podnosi a do potegi b
        //        //Math.sqrt(a) == wyciaga pierwiastek kwadratowy z a
        //          //Math.pow(a, 1/b) == pierwiastek b-stopnia z a
        // proponowane znaki: power dla potegi, root dla pierwiastka

        //zczytujemy
        Scanner input = new Scanner(System.in);
        System.out.println("podaj dwie liczby");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("podaj znak");
        String znak = input.next();

        switch (znak){
            case "+": {
                System.out.println(a+b);
                break;
            }
            case "-": {
                System.out.println(a-b);
                break;
            }
            case "*": {
                System.out.println(a*b);
                break;
            }
            case "/": {
                System.out.println(a/b);
                break;
            }
            default:{
                System.out.println("nie ma takiej matematyki");
                break;
            }
        }
    }
}
