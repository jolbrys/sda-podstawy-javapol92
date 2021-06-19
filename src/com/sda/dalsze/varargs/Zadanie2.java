package com.sda.dalsze.varargs;

public class Zadanie2 {
    //wypisz roznice miedzy najmniejszą a największą zmienną wczytaną jako varargs
    //podpowiedz: przydadza sie 2 zmienne na min i max. mozna je potem odjac od siebie.
    public static void main(String[] args) {
        System.out.println(metoda(11, 4, 1, 6, 89, 2 ,7, 45));
    }

    private static int metoda(int... zmienne){
        int min = zmienne[0];
        int max = zmienne[0];

        for(int e : zmienne){
                if(e < min) min = e;
                if(e > max) max = e;
        }

        return max - min;
    }
}
