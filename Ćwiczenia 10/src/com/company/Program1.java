package com.company;

public
class Program1 {
    public static void main(String[] args) {
        java.util.Scanner in = new
                java.util.Scanner(System.in);
        System.out.println("Wpisz kwote w zlotowkach:");
        double cash = in.nextDouble();
        {
            int sum = 0;
            while (cash - 5 >= 0) {
                sum++;
                cash -= 5;
            }
            System.out.println(sum + " * 5zl ");
        }
        {
            int sum = 0;
            while (cash - 2 >= 0) {
                sum++;
                cash -= 2;
            }
            System.out.println(sum + " * 2zl ");
        }
        {
            int sum = 0;
            while (cash - 1 >= 0) {
                sum++;
                cash -= 1;
            }
            System.out.println(sum + " * 1zl ");
            //konwersja na złotówki z groszy 0,50 -> 5,00
            cash = cash * 10;
        }
        {
            int sum = 0;
            while (cash - 5 >= 0) {
                sum++;
                cash -= 5;
            }
            System.out.println(sum + " * 50gr ");
        }
        {
            int sum = 0;
            while (cash - 2 >= 0) {
                sum++;
                cash -= 2;
            }
            System.out.println(sum + " * 20gr ");
        }
        {
            int sum = 0;
            while (cash - 1 >= 0) {
                sum++;
                cash -= 1;
            }
            System.out.println(sum + " * 10gr ");
        }
        // konwersja z małych nominałów groszowych na większe groszowe 0,05 -> 0,50 -> 5,00
        cash = cash * 10;
        {
            int sum = 0;
            while (cash - 5 >= 0) {
                sum++;
                cash -= 5;
            }
            System.out.println(sum + " * 5gr ");
        }
        {
            int sum = 0;
            while (cash - 2 >= 0) {
                sum++;
                cash -= 2;
            }
            System.out.println(sum + " * 2gr ");
        }
        {
            int sum = 0;
            while (cash - 1 >= 0) {
                sum++;
                cash -= 1;
            }
            System.out.println(sum + " * 1gr ");
        }
    }
}

