package com.sda.podstawy.wstep;

import java.util.Scanner;

public class Zadanie1 {
    //zadeklaruj zmienna która przechowuje wartosc ilus centrymetrow
    //wydrukuj wartosc tej zmienniej, przeliczona na cale
    //1 cal = 2.54 cm
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);

        System.out.println("Podaj liczbe cm: ");
        double cm = wejscie.nextDouble();
        double inch = cm/2.54;
        System.out.println(cm + " cm to na cale jest:");
        System.out.println(inch);

    }
}
