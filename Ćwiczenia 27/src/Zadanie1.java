import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie1 {
    public static void main(String[] args) {
        //heksadecymalna
        String hex = "1BC16D674EC7FFFF";
        //musimy zrobić tak by rozpatrzył od A do F; a do F i od 0 do 9

        // zostawiamy {1,} -> bo nie wiemy ile liczb wprowadzimy
        Pattern pattern = Pattern.compile("[A-F0-9a-f]{1,}");
        //z jakim wzorem ma porównywać
        Matcher matcher = pattern.matcher(hex);
        //matches — pozwala sprawdzić, czy cały ciąg znaków spełnia kryteria
        System.out.println(matcher.matches());
    }
}
