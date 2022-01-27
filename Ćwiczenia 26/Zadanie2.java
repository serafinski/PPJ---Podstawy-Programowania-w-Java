import java.io.IOException;
import java.io.InputStream;

public
class Zadanie2 {

    public static void main(String[] args) {
        //strumień wejściowy
        InputStream strumienWe = System.in;

        //do momentu aż jest to prawda
        while (true) {
            try {
                //wczytaj wartość ze strumienia
                int val = strumienWe.read();
                //wypisz literę i odpowiadającą jej wartość ASCII
                System.out.println(((char)val) +" - "+val);
                // przechwyć wyjątek, jeżeli nieudana próba odczytu
            } catch (IOException e) {
                // wypisz błąd
                e.printStackTrace();
            }
        }
    }
}

