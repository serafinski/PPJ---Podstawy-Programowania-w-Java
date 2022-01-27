import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie5_PD {
    public static void main(String[] args) {
        String ciag_znakow = "A.B.C.D";

        //dodajemy ^ - by nie było nic przed a $ - by nie było nic po wyrażeniu
        Pattern pattern = Pattern.compile("^[A-Za-z].[A-Za-z].[A-Za-z].[A-Za-z]$");
        //z czym ma porównywać -> ze wpisanym tekstem
        Matcher matcher = pattern.matcher(ciag_znakow);
        //sprawdź, czy całe wyrażenie spełnia kryteria
        System.out.println(matcher.find());
        //wypisz to wyrażenie
        System.out.println(matcher.group());
    }
}
