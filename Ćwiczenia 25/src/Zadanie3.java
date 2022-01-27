import java.io.FileWriter;
import java.io.IOException;


public
class Zadanie3 {

    public static void main(String[] args) {
        // wygeneruj 4 pliki
        for(int i=1; i<5; i++) {
            // wygeneruj tablice
            int[] tab = generate();
            // posortuj tablice
            sort(tab);
            // zapisz do pliku
            save("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 25\\src\\inputData"+i+".txt", tab);
        }

    }
    // generowanie losowych liczb — tyle liczb będzie losowanych
    public static int[] generate(){
        // tablica o rozmiarze 10
        int[] tab = new int[10];

        //generuj losowe liczby do momentu aż nie skończy się tablica
        for(int i=0; i< tab.length; i++)
            tab[i] = (int)(Math.random()*10000);
        // zwróć tablice losowych liczb
        return tab;
    }
    // sortowanie wcześniej stworzonych liczb
    public static void sort(int[] tab){

        // algorytm sortowania — znany z poprzednich zajęć
        for(int i=0; i<tab.length-1; i++){
            for(int j=0; j < tab.length - i - 1; j++){
                if(tab[j] > tab[j+1]){
                    int tmp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = tmp;
                }
            }
        }
    }
    // zapisywanie pliku — przyjmuje ścieżkę i tablice losowych liczb
    public static void save(String path, int[] tab){
        //potencjalnie podnieś wyjątek
        try {
            // utwórz zmienną fw klasy FileWriter
            FileWriter fw = new FileWriter(path);
            //wpisz liczby z tablicy do pliku
            for(int val : tab)
                fw.write(""+val+" ");
            //zamknij strumień
            fw.close();
            //przechwyć wyjątek
        } catch (IOException e) {
            //wypisz błąd
            e.printStackTrace();
        }
    }
}
