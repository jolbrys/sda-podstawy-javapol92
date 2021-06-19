package com.sda.dalsze.varargs;

public class Przyklad {
    public static void main(String[] args) {

        System.out.println("arg1: " + args[0] + " arg2: " + args[1] + " arg3: " + args[2] );

        System.out.println();

        int[] tablica1 = {1, 5, 2, 6, 5, 7};
        int[] tablica2 = {10, 21, 55};

        metodaJeden(tablica1);
        metodaJeden(tablica2);


        System.out.println();
//
        metodaDwa(1, 4, 3, 6 , 7, 1, 67);
        metodaDwa(1, 2, 4);
    }

    private static void metodaJeden(int[] varargs){
        for(int element : varargs){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void metodaDwa(int... varargs){
        for(int element : varargs){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
