import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie4 {
    public static void main(String[] args) {
        String tekst = "wieś w Polsce położona w województwie wielkopolskim, w powiecie kolskim, w gminie Olszówka. W latach 1975-1998 miejscowość położona była w województwie konińskim.";

        //chcemy by sprawdzał ile par liczb wystąpiło w tym tekście
        Pattern pattern = Pattern.compile("\\s\\d{1,}[\\s-]\\d{1,}\\s");
        //z czym ma porównywać -> ze wpisanym tekstem
        Matcher matcher = pattern.matcher(tekst);
        //rób to tak długo aż znajdujesz jakiś ciąg znaków — który spełnia kryteria
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
