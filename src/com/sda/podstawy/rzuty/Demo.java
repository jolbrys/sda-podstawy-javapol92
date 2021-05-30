package com.sda.podstawy.rzuty;

public class Demo {
    public static void main(String[] args) {
        //rzutowanie niejawne
        System.out.println("---konwersja niejawna (implicit):");

        //byte na int
        byte a = 100;
        int b = a;
        System.out.println("a(byte) = " + a);
        System.out.println("b(int) = " + b);

        //int na long
        long c = b;
        System.out.println("c(long) = " + c);

        //long na floata
        float d = c;
        System.out.println("d(float) = " + d);

        System.out.println();
        //char na inta
        char e = 'e';
        int f = e;
        System.out.println("e(char) = " + e);
        System.out.println("f(int) = " + f);

        //konwersja jawna
        System.out.println("\n---konwersja jawna(explicit): ");

        //float na longa
        float x = 100.25f;
        long y = (long) x;
        System.out.println("x(float) = " + x);
        System.out.println("y(long) = " + y);

        //long na inta
        int z = (int) y;
        System.out.println("z(int) = " + z);

        //int na shorta
        short w = (short) z;
        System.out.println("w(short) = " + w);

        //duzy(wiekszy niz zakres int) long na inta
        System.out.println();
        long p = 9999999999999999l;
        int q = (int) p;
        System.out.println("p(long) = " + p);
        System.out.println("q(int) = " + q);

        //string na inta
        String i = "658347";
        int j = Integer.valueOf(i);
        System.out.println("j = " + j);

    }
}
