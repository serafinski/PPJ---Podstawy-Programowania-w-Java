//KORZYSTAMY Z Word Z POPRZEDNIEGO ZADANIA!

public class Zadanie12_cw20 {
    public static void main(String[] args) {
        Word ala = new Word();
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

        PhraseList pl = new PhraseList();
        pl.addWordAtEnd(ala);
        pl.addWordAtEnd(ma);
        pl.addWordAtEnd(kota);

        pl.show();// pokaż nam elementy

    }
}

// SPOSÓB LISTĄ JEDNOKIERUNKOWĄ
class PhraseList{
    private MyList myList; // bazujemy na klasie MyList

    public PhraseList(){
        myList = new MyList(); // zainicjowanie zmiennej
    }

    public void addWordAtEnd(Word word){
        //trzeba dodać jakiś nowy element, który będzie oczekiwał dostarczenia mu jakiegoś słowa
        myList.add(new Element(word)); //korzystamy z metody add z MyList
    }

    public void show(){
        myList.show(); // wywołaj show z tej listy
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

