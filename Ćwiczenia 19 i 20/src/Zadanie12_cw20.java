//KORZYSTAMY Z Word Z POPRZEDNIEGO ZADANIA!

public class Zadanie12_cw20 {
    public static void main(String[] args) {

        //taka metoda zapisu, bo używamy wcześniej zdefiniowanej klasy Word
        Word ala = new Word();

        //używamy wcześniej zdefiniowanej metody addChar dla klasy Word
        ala.addChar('a');
        ala.addChar('l');
        ala.addChar('a');

        Word ma = new Word();
        ma.addChar('m');
        ma.addChar('a');

        Word kota = new Word();
        kota.addChar('k');
        kota.addChar('o');
        kota.addChar('t');
        kota.addChar('a');

        //inicjujemy zmienną klasy PhraseList
        PhraseList pl = new PhraseList();

        //używamy metody addWordAtEnd utworzonej dla klasy PhraseList dodającej słowa po sobie
        pl.addWordAtEnd(ala);
        pl.addWordAtEnd(ma);
        pl.addWordAtEnd(kota);

        //używamy metody show utworzonej dla klasy PhraseList
        pl.show();// pokaż nam elementy

    }
}

// SPOSÓB LISTĄ JEDNOKIERUNKOWĄ
class PhraseList{
    //klasa myList — dodana z wykładu!
    private MyList myList; // bazujemy na klasie MyList

    public PhraseList(){
        myList = new MyList(); // zainicjowanie zmiennej
    }

    public void addWordAtEnd(Word word){
        //trzeba dodać jakiś nowy element, który będzie oczekiwał dostarczenia mu jakiegoś słowa

        //korzystamy z Klasy Element — dodana z wykładu

        // tworzymy obiekt klasy Element — który przyjmuje zmienną klasy word
        myList.add(new Element(word)); //korzystamy z metody add utworzonej dla klasy MyList
    }

    // wywołaj show z tej listy
    public void show(){
        myList.show(); //korzystamy z metody show utworzonej dla klasy myList
    }
}
// SPOSÓB LISTĄ JEDNOKIERUNKOWĄ





//TABLICOWY SPOSÓB
class PhraseArr{
    private Word[] words;
    private int fill;


    public PhraseArr(){
        this.words = new Word[10]; // ile słów na początku
        fill = 0; // informacja ile tych słów tam jest
    }

    // dodanie kolejnego słowa
    public void addWordAtEnd(Word word){ // word musi się gdzieś pojawić
        //Dokładnie to samo zadanie co poprzednio tylko inny typ zmiennej i nazwa!

        //czy mamy wystarczająco elementów w naszej tablicy, by umieścić kolejne
        if(fill >= words.length){ // jeżeli skończy nam się miejsce
            Word[] tmp = new Word[words.length*2]; // dubluj rozmiar
            for(int i=0; i<fill; i++)
                tmp[i]=words[i]; // wpisz wartości
            words = tmp; // nadaj
        }
        words[fill++] = word;
    }

    public void show(){
        for(int i=0 ; i< fill; i++)
            words[i].show();
    }
}
//TABLICOWY SPOSÓB

