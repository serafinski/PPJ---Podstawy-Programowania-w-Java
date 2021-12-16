package com.company;

public class Program5 {
    public static void main(String[] args) {
        for (int i=0; i < 6; i++) {
            //wewnętrzna pętla zostaje wykonana 6x dla każdego obrotu pętli
            //operacja wyświetlająca 10 gwiazdek w linijce
            for(int j=0; j < 11;j++){
                if( i%2 == 0 ){
                    System.out.print(j % 2 == 0 ? "*": " ");
                }else{
                    System.out.print(j % 2 == 0 ? " " : "*");
                }
            }
            System.out.println();
        }
    }
}
