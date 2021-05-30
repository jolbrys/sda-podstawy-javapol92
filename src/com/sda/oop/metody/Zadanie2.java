package com.sda.oop.metody;

public class Zadanie2 {
    //napisz metode, ktora przelicza temperature zadana
// w stopniach celsiusa na stopnie fahrenheita
//wzor przeliczajacy celsjusze na fahrenheity: F = 32 + 1.8 * C
    public static void main(String[] args) {
        double cels = 27;
        System.out.println(przeliczNaFahrenheit(cels));

    }

    static double przeliczNaFahrenheit(double celsjusze){
        return 32 + 1.8 * celsjusze;
    }
}
