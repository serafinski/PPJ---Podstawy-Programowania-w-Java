public class kalendarz_zajecia {
    public static void main(String[] args) {
        printMonth(12,2021);
    }
    public static void printMonth(int month, int year){
        // month — może przyjmować wartości od 1 do 12

        // Potrzebne nam są dwie informacje:
        // 1 dzień miesiąca — jaki to dzień tygodnia?
        // ile dni ma dany miesiąc

        // chyba używał algorytmu Tomohiko Sakamoto
        int t[] = {0,3,2,5,0,3,5,1,4,6,2,4};


        //od czego będzie jeszcze zależał dzień tygodnia? - od roku!

        //robimy t[month-1] -> z tego powodu, że można też liczyć miesiące od 0 do 11
        // +1, bo chcemy od pierwszego dnia miesiąca
        int dayOfWeek = (year + year/4 - year/100 + year/400 +t[month-1]+1)%7; // rok przestępny albo nie


        //ile dni miesiąca?
        int daysInMonth = month != 2 ?
                31 - (((month-1)%7)%2):
                //jeżeli podzielny przez 4 -> dodajemy 1 dzień,
                //jeżeli podzielny przez 100 -> odejmiemy 1 dzień,
                //jeżeli podzielny przez 400 -> dodajemy 1 dzień
                28 - (year%4==0?1:0) - (year%100==0? 1:0) + (year%400==0 ? 1:0);

        // bufor — do którego dnia ma to iść
        for(int i=1; i<dayOfWeek;i++)
            System.out.print("   ");

        //wypisywanie na ekranie
        for(int i=1;i<daysInMonth;i++){
            System.out.printf("% 3d", i); // print z formatowaniem! -> d-całkowita, mająca 3 miejsca i dodatkowo spacją zapełniamy puste miejsca

            // łamanie linii
            if ((dayOfWeek+i-1)%7==0)
                System.out.println();
        }

    }
}
