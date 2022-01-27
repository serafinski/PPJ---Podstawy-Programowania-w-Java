import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public
class Zadanie4 {

    public static void main(String[] args) {
        // deklarujemy FileWriter z pierwotną wartością null
        FileWriter fw = null;
        //potencjalnie podnieś wyjątek
        try {
            // wypisz dane do nowego pliku wynikowego
            fw = new FileWriter("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 25\\src\\inputDataOut.txt");
            //przechwyć wyjątek
        } catch (IOException e) {
            // wpisz błąd
            e.printStackTrace();
        }
        // przygotuj strumienie do plików

        // z ilu plików wczytujemy
        int filesCount = 4;
        // KLUCZOWY KROK!!! -> nowa tablica dla FileReader — o wielkości takiej jak filesCount
        FileReader[] streamIn = new FileReader[filesCount];
        // tablica values o takiej samej wielkości jak filesCount
        int[] values = new int[filesCount];

        // przejdź przez wszystkie 4 pliki
        for(int i=1; i<5; i++) {
            // potencjalnie podnieś wyjątek
            try {
                // odczytaj wcześniej stworzony plik "inputData" o indeksie i-1
                streamIn[i-1] = new FileReader("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 25\\src\\inputData"+i+".txt");
                // nadaj tablicy values na pozycji i-1 wartości dla indeksu-1 z tablicy StreamIn
                values[i-1] = readValue(streamIn[i-1]);
                // przechwyć wyjątek
            } catch (FileNotFoundException e) {
                // wypisz błąd
                e.printStackTrace();
            }
        }
        // podczas kiedy wszystkie indeksy w tablicy NIE SĄ ujemne
        while (!isAllNegative(values)) {
            // dostań minimalny indeks — czyli tam, gdzie pierwszy indeks nie jest negatywny!
            int minIndex = getFirstIndexNonNegative(values);

            //tak długo, jak "i" jest mniejsze od tablicy values
            for (int i = 1; i < values.length; i++)
                // jeżeli indeks values nie jest równy -1 i minimalny indeks w tablicy values jest większy do indeksu i dla values
                if (values[i] != -1 && values[minIndex] > values[i])
                    // to minimalny indeks jest równy i
                    minIndex = i;

            // zapisz
            save(fw, values[minIndex]);
            // uzupełnij zapisana wartość
            values[minIndex] = readValue(streamIn[minIndex]);
        }
        //potencjalnie podnieś wyjątek
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // funkcja czytająca wartości
    public static int readValue(FileReader fr){
        // inicjacja zmiennej val — z wartością 0
        int val = 0;
        // zainicjowanie zmiennej tmp
        int tmp;
        //potencjalnie podnieś wyjątek
        try {
            // kiedy tmp — które odczytuje — nie jest równe -1 lub spacja
            while( (tmp = fr.read()) != -1 && tmp != ' ')
                // odczytuj wartość i przypisz ją do val
                val = (val*10) + (tmp-'0');
            // jeżeli tmp jest równe -1
            if(tmp == -1)
                // zwróć tmp
                return tmp;
            // zwróć wartość val
            return val;
            //przechwyć wyjątek
        } catch (IOException e) {
            // wypisz błąd
            e.printStackTrace();
        }
        // jeżeli nie -> zwróć -1
        return -1;
    }

    // zapisuje liczby do pliku
    public static void save(FileWriter fw, int value){
        //potencjalnie podnieś wyjątek
        try {
            //wpisz liczby do pliku
            fw.write(value+" ");
            //przechwyć wyjątek
        } catch (IOException e) {
            // wypisz błąd
            e.printStackTrace();
        }
    }

    // sprawdza, czy wszystkie indeksy w tablicy są ujemne
    public static boolean isAllNegative(int[] tab){
        // advanced for przez tablice
        for(int val : tab)
            // jeżeli znajdzie się jakiś indeks, który jest ujemny
            if( val >= 0)
                //zwróć fałsz
                return false;
        // jeżeli nie ma nie ujemnego indeksu — zwróć prawdę
        return true;
    }

    // dostań pierwszy indeks, który nie jest ujemny — dla dostarczonej tablicy
    public static int getFirstIndexNonNegative(int[] tab){
        //przejdź przez tablice
        for(int i=0; i<tab.length; i++)
            // jeżeli indeks jest większy od 0
            if(tab[i] >= 0)
                // zwróć go
                return i;
        // jeżeli nie zwróć -1
        return -1;
    }
}
