package com.company;

public class Program4 {
    public static void main(String[] args) {
        java.util.Scanner in = new
                java.util.Scanner(System.in);
        System.out.println("Wpisz liczbe calkowita:");
        int n = in.nextInt();

        //liczba wierszy -> kazdy wiersz -> kolejna potega -> ograniczamy by było od 2 do 5
        for(int counter=1; counter<5; counter++){
            // liczba kolumn -> kazda kolumna -> do jakiego n maja byc liczone potegi od 2 do 5
            for(int lock = 1; lock<n+2;lock++){
                if(lock==n+1){
                    System.out.println();
                }
                else{
                    System.out.print((int)Math.pow(lock,counter)+" ");
                }
            }
        }
    }
}
