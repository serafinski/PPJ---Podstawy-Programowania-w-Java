public class Zadanie11_cw20 {
    public static void main(String[] args) {
        Word slowo = new Word();
        slowo.addChar('K');
        slowo.addChar('A');
        slowo.addChar('J');
        slowo.addChar('A');
        slowo.addChar('K');

        slowo.show();
        System.out.println();
        slowo.length();
    }
}
class Word{
    private char[] data;
    private int fill;

    public Word(){
        data = new char[100];
        fill = 0;
    }


    public void addChar(char add) {
        //kluczowa kwestia — zobaczenie, że tablica może nam się kiedyś skończyć

        //czy mamy wystarczająco elementów w naszej tablicy, by umieścić kolejne
        if(fill >= data.length){ // jeżeli skończy nam się miejsce
            char[] tmp = new char[data.length*2]; // dubluj rozmiar
            for(int i=0; i<fill; i++)
                tmp[i]=data[i]; // wpisz wartości
            data = tmp; // nadaj
        }
        data[fill++] = add; //dodajemy nową wartość
    }

    public void show(){
        for(int i = 0; i < fill; i++)
            System.out.print(data[i]);
        System.out.println();
    }
    public int length(){
        return fill;
    }
}