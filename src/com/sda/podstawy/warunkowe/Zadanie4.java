package com.sda.podstawy.warunkowe;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        //pobierz od uzytkownika nazwe dnia tygodnia
        //i wypisz ktory dzien tygodnia to jest
        //np poniedzialek -> 1
        //jesli uzytkownik poda jakis nieistniejacy dzien
        //poinformuj go o tym
        //* obsluz przypadki kiedy uzytkownik wpisuje
        //dzien tygodnia wielka lub mala litera
        //np Niedziela lub niedziela

        Scanner input = new Scanner(System.in);
        System.out.println("podaj dzien");
        String dzien = input.next();

        switch (dzien){
            case "niedziela":
            case "Niedziela":{
                System.out.println(7);
                break;
            }
            case "Sobota":
            case "sobota": {
                System.out.println(6);
                break;
            }
            case "Piatek":
            case "piatek": {
                System.out.println(5);
                break;
            }
            default:{
                System.out.println("nie ma takiego dnia");
                break;
            }
        }
    }
}
