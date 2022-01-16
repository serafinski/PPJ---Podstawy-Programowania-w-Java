import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zadanie2 {
    public static void main(String[] args) {
        FileInputStream fis;

        try{
            //wczytaj ścieżkę pliku używając Copy Path Reference -> Absolute Path

            //zmienna przechowująca ścieżkę
            fis = new FileInputStream("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 25\\src\\zad1.txt");

            int res; // zainicjowanie zmiennej res
            int pVal = 0; //wartość cząstkowa
            int sVal = 0; //wartość, w której będziemy sumować

            //nadajemy wartości fis.read zmiennej res — tak długo aż fis.read() != -1 -> nie będzie końca pliku
            while ((res = fis.read())!= -1){
                //jeżeli będzie spacja — wtedy skończ odczytywać liczbę
                if(res == ' '){
                    //wypisz odczytaną liczbę
                    System.out.println(pVal);
                    //dodaj ją do wartości którą sumujemy
                    sVal+=pVal;
                    //zresetuj wartość cząstkową
                    pVal =0;
                }
                else{
                    //to pozwala odczytywać dalej liczbę
                    pVal = (pVal*10) + (res - '0');
                }
            }
            //wypisz wartość jak skończysz
            System.out.println(sVal);

            // przechwyć wyjątek, jeżeli nie znajdzie pliku
        } catch (FileNotFoundException e) {
            //wypisz błąd
            e.printStackTrace();
            //przechwyć wyjątek, jeżeli nieudana próba odczytu
        } catch (IOException e){
            //wypisz błąd
            e.printStackTrace();
        }
    }
}
