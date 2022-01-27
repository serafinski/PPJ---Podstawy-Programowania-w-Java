import java.io.IOException;
import java.io.InputStream;

//TO ZADANIE JEST NIE DOKOŃCZONE!

public
class Zadanie3{

    public static void main(String[] args) {

        // wszystko działa, ale na końcu trzeba dać spacje lub tabulator

        MojSkaner ms = new MojSkaner(System.in);
        //1 słowo
        System.out.println(ms.odczytajSlowo());
        //2 słowo
        System.out.println(ms.odczytajSlowo());
        //3 słowo
        System.out.println(ms.odczytajSlowo());
    }
}


class MojSkaner{

    //zgodnie z poleceniem — deklarujemy jedno pole typu InputStream

    private InputStream strumienWe;

    //zgodnie z poleceniem — konstruktor przyjmujący parametr InputStream

    //InputStream — to co do nas przychodzi
    public MojSkaner(InputStream strumienWe) {
        this.strumienWe = strumienWe;
    }
    //zgodnie z poleceniem — metoda String odczytajSlowo
    public String odczytajSlowo(){
        //do tej wartości będą zapisywane literki w postaci liczb -> wprowadzone z klawiatury
        int val;

        //StringBuilder pozwala dodawać znaki do siebie
        StringBuilder sb = new StringBuilder();
        try {

            //zgodnie z poleceniem — gdzie słowo jest oddzielone dowolnym znakiem białym

            //wczytuj literki — podczas kiedy wprowadzona wartość to nie spacja lub tabulator
            while ((val = strumienWe.read()) != ' ' && val != '\t')
                //dołączaj liczby zamienione na literki do naszego StringBuildera
                sb.append((char)val);

            //przechwyć, jeżeli nieudana próba odczytu
        }catch(IOException ex){
            // wypisz błąd
            System.out.println(ex);
        }
        //zwróć
        return sb.toString();
    }
}