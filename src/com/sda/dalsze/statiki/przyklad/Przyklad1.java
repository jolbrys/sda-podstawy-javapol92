package com.sda.dalsze.statiki.przyklad;

import java.util.Scanner;

public class Przyklad1 {
    public static void main(String[] args) {
        double b = 10;
        double a = 2;

        Scanner input = new Scanner(System.in);
        int zmienna = input.nextInt();

        double wynik = Math.pow(b, a);
    }
}
