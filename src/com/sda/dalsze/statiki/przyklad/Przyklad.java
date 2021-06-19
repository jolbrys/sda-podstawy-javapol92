package com.sda.dalsze.statiki.przyklad;

public class Przyklad {
    public static void main(String[] args) {
        //statyczna metoda w tej samej klasie
        //statyczna metoda w klasie obok
        System.out.println(Przyklad.jakasMetoda(4, 5));
        System.out.println();
        System.out.println(Statyczne.jakasMetoda(6, 7));

    }

    private static int jakasMetoda(int a, int b) {
        System.out.println("pochodze ze statycznej metody");
        System.out.println("linijka 2");
        if(a + b < 0) {
            return a - b;
        }
        return a + b;
    }
}
