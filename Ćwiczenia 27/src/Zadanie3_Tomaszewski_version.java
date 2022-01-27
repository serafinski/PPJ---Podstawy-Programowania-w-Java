import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie3_Tomaszewski_version {
    public static void main(String[] args) {
        String validHex = "0F";

        Pattern pattern = Pattern.compile("[0-9a-fA-F]{1,}");
        Matcher matcher = pattern.matcher(validHex);
        System.out.println(matcher.matches());
    }
}
