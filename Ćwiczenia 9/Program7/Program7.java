import java.time.Year;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Wpisz dzien");
    int day = scan.nextInt();
    System.out.println("Wpisz miesiac");
    int month = scan.nextInt();
    System.out.println("Wpisz rok");
    int year = scan.nextInt();

    int sumDays = 0;
    for (int i=1; i<month; i++){
    sumDays += switch(i){
        case 1,3,5,7,8,10,12 -> 31;
        case 4,6,9,11 -> 30;
        case 2 -> (year%4==0 && year%100!=0) || year%400 == 0 ? 28:29;
        default -> 0;
    };
    }
    sumDays+=day;
    System.out.println("Dzien: "+ day +"; miesiac:  "+ month+ "; Od rozpoczecia roku do podanego dnia mineło "+sumDays+" dni.");
}
}