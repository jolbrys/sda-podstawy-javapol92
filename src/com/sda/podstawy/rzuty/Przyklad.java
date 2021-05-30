package com.sda.podstawy.rzuty;

public class Przyklad {
    public static void main(String[] args) {
        double n = 99.999;
        int m = (int) n;

        System.out.println("m = " + m);

        double a = 99.999;
        int b = (int) Math.round(a);
        System.out.println("b = " + b);
    }
}
