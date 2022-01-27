import java.io.IOException;
import java.io.InputStream;

public
class Zadanie1 {

    public static void main(String[] args) {
        //strumień wejściowy
        InputStream strumienWe = System.in;
        try {
            //wczytaj wartość ze strumienia
            int val = strumienWe.read();
            //wypisz wartość
            System.out.println(val);
            //przechwyć wyjątek, jeżeli nieudana próba odczytu
        } catch (IOException e) {
            //wypisz błąd
            e.printStackTrace();
        }

    }
}
