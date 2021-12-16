package com.company;
// napisać to też switchem
public class Program6 {
    public static void main(String[] args) {
        java.util.Scanner in = new
                java.util.Scanner(System.in);
        int win = 0;
        do {
            System.out.println("Wpisz: ");
            System.out.println("0 - dla kamien");
            System.out.println("1 - dla papier");
            System.out.println("2 - dla nozyce");
            int input = in.nextInt();

            // math random wybiera liczby od 0 do 1 - Z WYŁĄCZENIEM 1!

            // nie dawać w case zmiennych typowanych dynamicznie

            int random = (int) (Math.random() * 3);
            if (random == 0) {
                System.out.println("Komputer wybral kamien");
            } else if (random == 1) {
                System.out.println("Komputer wybral papier");
            } else {
                System.out.println("Komputer wybral nozyce");
            }


            if (input == 0) {
                System.out.println("Wybrales kamien!");
            } else if (input == 1) {
                System.out.println("Wybrales papier!");
            } else if (input == 2) {
                System.out.println("Wybrales nozyce!");
            } else {
                System.out.println("Wpisz odpowiednią liczbe miedzy 1 a 3!");
            }

            if (input == random) {
                System.out.println("REMIS");
            } else if ((input == 0 && random == 2) || (input == 1 && random == 0) || (input == 2 && random == 1)) {
                System.out.println("Wygrana! :)");
                win = 1;
            } else {
                System.out.println("Przegrana! :(");
                win =1;
            }
        }
        while (win==0);
    }
}
