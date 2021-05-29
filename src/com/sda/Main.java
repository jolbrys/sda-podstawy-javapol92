package com.sda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj kwotę pożyczki jaką chcesz uzyskać");
        System.out.println("W ilu ratach chcesz spłacić pozyczkę?");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        double amount = input.nextDouble();
        int ilosc_rat = input2.nextInt();
        double procent = 0.025;
        double procent2 = 0.05;
        double procent3 = 0.1;
        //for (int i = 6; i <= 48; i++) {
        //System.out.println("Oprocentowanie to " + ": ");
        if (amount > 100 & amount < 10000) {
            if (ilosc_rat < 13) {
                double oprocentowanie = procent * amount;
                System.out.println("Oprocentowanie to " + oprocentowanie);
            } else if (ilosc_rat >= 13 & ilosc_rat < 25) {
                double oprocentowanie2 = procent2 * amount;
                System.out.println("Oprocentowanie to " + oprocentowanie2);
            } else if (ilosc_rat >= 25 & ilosc_rat < 48) {
                double oprocentowanie3 = procent3 * amount;
                System.out.println("Oprocentowanie to " + oprocentowanie3);
            } else if (ilosc_rat > 48) {
                double oprocentowanie3 = procent3 * amount;
                System.out.println("Oprocentowanie to " + oprocentowanie3);
            } else
                System.out.println("Niepoprawna ilosc rat");
        } else if (amount > 10000) {
            double oprocentowanie4 = 5000;
            System.out.println(oprocentowanie4);
        } else if (amount < 100) {
            System.out.println("Wprowadzona kwota jest za mala");
        }
    }
}
