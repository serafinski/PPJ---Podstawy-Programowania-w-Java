import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public
class Zadanie4 {

    public static void main(String[] args) {
        try {
            PNWReader pnw = new PNWReader(
                    new FileReader("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 26\\tekst.txt"),
                    PNWReader.PRIME | PNWReader.ARMSTRONG
            );
            pnw.show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class PNWReader{

    //Wartości, które są zawsze takie same i się nie zmienią!
    public static final int PRIME = 1;
    public static final int ARMSTRONG = 2;
    public static final int WORD = 4;
    //Wartości, które są zawsze takie same i się nie zmienią!


    //pozwala na odwołanie się bezpośrednio do strumienia znakowego — odczytuje nam znaki
    private FileReader fr;

    //będzie dawał możliwość wybrania typu wartości, które chcemy wyświetlić
    private int type;

    //konstruktor
    public PNWReader(FileReader fr, int type) {
        this.fr = fr;
        this.type = type;
    }

    private String getToken(){

        //StringBuilder pozwala dodawać znaki do siebie
        StringBuilder sb = new StringBuilder();

        //do tej wartości będą zapisywane literki w postaci liczb -> wprowadzone z klawiatury
        int val;

        try {
            //odczytuj wartości tak długo aż nie jest to spacja lub -1
            while ((val = fr.read()) != ' ' && val != -1)
                //dołączaj znaki do wartości
                sb.append((char) val);
            //jeżeli wartość to -1
            if(val == -1)
                //zwróć null
                return null;
            //przechwyć wyjątek
        }catch(IOException ex){
            //wypisz błąd
            System.out.println(ex);
        }
        //zwróć w postaci Stringa
        return sb.toString();
    }

    public void show(){
        String str;
        while ((str = getToken()) != null) {
            boolean b = switch (type) {
                case PNWReader.PRIME -> isPrime(str);
                case PNWReader.ARMSTRONG -> isNarcistic(str);
                case PNWReader.PRIME | PNWReader.ARMSTRONG -> isPrime(str) | isNarcistic(str);
                case PNWReader.WORD -> isWord(str);
                default -> false;
            };
            System.out.println(
                    b ? str : ""
            );
        }
    }


    //ALGORYTMY SPRAWDZAJĄCE CZY MAMY Z JAKIM TYPEM MAMY DO CZYNIENIA:


    //LICZBY PIERWSZE

    private boolean isPrime(String str){
        try {
            //parseInt -> zamienia nam String na int
            int val = Integer.parseInt(str);
            // dla i = 2; i mniejszego od wartości val
            for (int i = 2; i < val; i++)
                //jeżeli reszta z dzielenia przez jakiekolwiek i będzie równa 0 -> i będzie dzielnikiem liczby — zwróć fałsz
                if (val % i == 0)
                    return false;
            //jeżeli nie będzie równa 0 -> brak dzielnika dla liczby, oprócz jej samej — zwróć prawdę
            return true;
            //przechwyć — jeżeli nie będzie w stanie zamienić String na int
        }catch(NumberFormatException ex){
            //zwróć fałsz
            return false;
        }
    }


    //LICZBY NARCYSTYCZNE -> schemat skopiowany i z edytowany z zajęć 13 gdzie robiliśmy algorytm dla narcystycznych
    private boolean isNarcistic(String str){

        //do val przypiszemy wartość z podanego str
        int val;

        try {
            ////parseInt -> zamienia nam String na int
            val = Integer.parseInt(str);

            //przechwyć — jeżeli nie będzie w stanie zamienić String na int
        }catch(NumberFormatException ex){
            // zwróć fałsz
            return false;
        }

        //liczba cyfr
        int countDigit = 0;
        //nadaj tmp wartość val
        int tmp = val;

        //sprawdź z ilu cyfr składa się cyfra i wpisz do countDigit
        while(tmp > 0){
            tmp /= 10;
            countDigit++;
        }


        //
        int sum = 0;
        //ponownie nadaj tmp wartość val
        tmp = val;

        //do momentu aż tmp > 0
        while(tmp > 0){
            //cyfra
            int digit = tmp % 10;

            //
            int pow = digit;
            for(int i=1; i < countDigit; i++)
                pow *= digit;

            sum += pow;

            tmp /= 10;
        }
        return val == sum;
    }

    //SŁOWO
    private boolean isWord(String str){
        //przejdź przez słowo
        for(int i=0; i<str.length(); i++)
            //jeżeli nie ma liter
            if( !(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
                //zwróć fałsz
                return false;

        //w przeciwnym wypadku — zwróć prawda
        return true;
    }
}
//ALGORYTMY SPRAWDZAJĄCE CZY MAMY Z JAKIM TYPEM MAMY DO CZYNIENIA:

