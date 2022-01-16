import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zadanie1 {
    public static void main(String[] args) {
        FileInputStream fis;
        // 256 — bo kwestia danych (tyle wystarczy dla ASCII) - 256 bitów
        int[] data = new int[256];
        try{
            //wczytaj ścieżkę pliku używając Copy Path Reference -> Absolute Path

            //zmienna przechowująca ścieżkę
            fis  = new FileInputStream("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 25\\src\\Ala ma kota.txt");

            int res; // zainicjowanie zmiennej res

            //nadajemy wartości fis.read zmiennej res — tak długo aż fis.read() != -1 -> nie będzie końca pliku
            while ((res = fis.read())!=-1)
                //zwiększamy wartość w tablicy dla indeksu tam, gdzie jest wartość pasująca do indeksu od res
                data[res]++;
            // przechwyć wyjątek, jeżeli nie znajdzie pliku
        } catch (FileNotFoundException e) {
            //wypisz błąd
            e.printStackTrace();
            //przechwyć wyjątek, jeżeli nieudana próba odczytu
        } catch (IOException e) {
            //wypisz błąd
            e.printStackTrace();
        }

        // wypisz z całej pętli
        for(int i=0; i<data.length;i++){
            //tylko jeżeli dana literka wystąpiła
            if(data[i] !=0)
                System.out.println(">"+((char)i)+"< - występuje "+ data[i] + " raz/y!");
        }
    }
}
