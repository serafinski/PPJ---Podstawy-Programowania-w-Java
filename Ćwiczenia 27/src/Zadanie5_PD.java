import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie5_PD {
    public static void main(String[] args) {
        String ciag_znakow = "A.B.C.D";

        //dodajemy ^ - by nie było nic przed a $ - by nie było nic po wyrażeniu

        //kropka w nawiasie kwadratowym -> symbol alfabetu, a nie znak określający dowolny element!!!

        //NAJLEPSZA OPCJA
        Pattern pattern = Pattern.compile("(\\w[.]){3}\\w");

        //PIERWOTNA OPCJA PROPONOWANA PRZEZ DR TOMASZEWSKIEGO
        //Pattern pattern = Pattern.compile("([A-Za-z][.]){3}[A-Za-z]");

        //MOJA PIERWOTNA OPCJA
        //Pattern pattern = Pattern.compile("^[A-Za-z][.][A-Za-z][.][A-Za-z][.][A-Za-z]$");

        //z czym ma porównywać -> ze wpisanym tekstem
        Matcher matcher = pattern.matcher(ciag_znakow);
        //sprawdź, czy całe wyrażenie spełnia kryteria
        System.out.println(matcher.matches());
        //wypisz to wyrażenie
        System.out.println(matcher.group());
    }
}
