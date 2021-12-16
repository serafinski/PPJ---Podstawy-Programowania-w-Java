// Na podstawie:
// https://artofmemory.com/blog/how-to-calculate-the-day-of-the-week/?fbclid=IwAR0shMvOcbH9ni89n_aZujVc18MeTjGQaIUhKhIzgOW_cOe_6WySJci9d1k

public class Zadanie5 {
    public static void main(String[] args) {
        int miesiac = 12;
        int rok = 2021;
        printMonth(miesiac, rok);
    }

    public static void printMonth(int m, int y) {
        int spaces = dzien(koddnia(y), kodmiesiaca(m), kodwieku(y), rokprzestepny(y)); // wprowadza dane wyliczone z pojedynczych metod
        if (spaces == 0) {
            spaces = 7;
        }

        String[] dni = {"PN", "WT", "ŚR", "CZ", "PI", "SO", "NI"}; // wypisz dni tygodnia
        System.out.print("     ");

        for (int i = 0; i < dni.length; i++)
            System.out.printf("  %s ", dni[i]); // wypisywanie przy użyciu print z formatowaniem -> %s - interpretacja jako String
        System.out.println();

        int day = 1;
        int index = 0;
        int line = 1;
        System.out.print(line + "      ");

        for (int k = 1; k < spaces; k++) { // pierwszy rząd (spacje zamiast liczb)
            System.out.print("     ");
            index++;
        }

        for (int l = 0; l < 7 - index; l++) { // pierwszy rząd dni
            System.out.print(" " + day + "   ");
            day++;
        }
        System.out.println();

        for (int i = 0; i <= (liczbadni(m,y)- (7-index)+1)/7; i++){ // ilość tygodni
            line++;
            System.out.print(line + "      ");
            for (int j = 0; j < 7; j++){
                if (day <= liczbadni(m,y)){
                    if (day < 10){
                        System.out.print(" " + day + "   ");
                    } else{
                        System.out.print(day + "   ");
                    }
                    day++;
                }
            }
            System.out.println();
        }
    }

//=========================================================================
    public static int dzien(int dayCode, int monthCode, int centuryCode, int leapYear){ // wprowadź wyliczone dane
        return (dayCode + centuryCode + monthCode + 1 - leapYear) % 7; // zwróć wynik nawiasu % 7 -> 1 bo, chcemy cały miesiąc
    }

//=========================================================================
    public static int koddnia(int year){
        // zakładamy tylko wiek XX oraz XXI
        int kod = 0;

        // wiek XX
        if (year < 2000){
            kod = year - 1900; //zwraca ostatnie 2 liczby roku
        }

        // wiek XXI
        else if (year < 2100){
            kod = year - 2000; //zwraca ostatnie 2 liczby roku
        }
        return (kod + (kod / 4)) % 7; // formuła na kalkulacje kodu dnia
    }

//=========================================================================
    public static int kodmiesiaca(int month){

        //kody wg strony
        int rezultat = 0;
        switch (month){
            case 1,10 -> rezultat = 0;
            case 2,3,11 -> rezultat = 3;
            case 4,7 -> rezultat = 6;
            case 5 -> rezultat = 1;
            case 8 -> rezultat = 2;
            case 9,12 -> rezultat = 5;
        }
        return rezultat;
    }

//=========================================================================
    public static int kodwieku(int year){
        // zakładamy tylko wiek XX oraz XXI
        int rezultat = year / 100;

        //wiek XX
        if (rezultat == 19){
            return 0;
        }

        // wiek XXI
        else {
            return 6;
        }
    }

//=========================================================================
    public static int rokprzestepny(int year){ // czy rok jest przestępny
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return -1; // wg strony
        }
        return 0; // wg strony
    }

//=========================================================================
    public static int liczbadni(int m, int y) { // na podstawie kalendarza — które miesiące mają ile dni
        int days = 0;
        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2: // rok przestępny
                if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                    days = 29;
                    break;
                } else
                    days = 28;
                break;
        }
        return days;
    }
//=========================================================================
}
