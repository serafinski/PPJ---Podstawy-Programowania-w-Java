package com.company;

public class Nieskonczona_potega {
    public static void main(String[] args) {
        java.util.Scanner in = new
                java.util.Scanner(System.in);
        System.out.println("Wpisz liczbe calkowita:");
        int n = in.nextInt();
        int counter = 1;
        while (counter<n){
            System.out.println("Potęga " + counter + " liczby: " + n + " wynosi " + Math.pow(n,counter));
            counter++;
    }
}
}
