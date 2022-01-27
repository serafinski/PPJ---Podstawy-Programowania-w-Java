import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie2 {
    public static void main(String[] args) {
        String validDate = "2022-01-25";

        //w {} -> liczba cyfr, które mogą być obok siebie

        //{1,2} -> opcja -> 1 albo 2 cyfry -> bo dzień i miesiąc mają być możliwe do zapisania w postaci jedno lub dwu znakowej
        Pattern pattern = Pattern.compile("\\d{4}-\\d{1,2}-\\d{1,2}");
        //z jakim wzorem ma porównywać
        Matcher matcher = pattern.matcher(validDate);
        // czy zgadza się z wyznaczonymi kryteriami
        System.out.println(matcher.matches());
        // wypisuje to, co spełnia kryteria
        System.out.println(matcher.group());
    }

}
