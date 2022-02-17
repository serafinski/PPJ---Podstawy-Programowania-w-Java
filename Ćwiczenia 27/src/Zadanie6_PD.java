import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Zadanie6_PD {
    public static void main(String[] args) {
        int result = 0;
        try {
            //odczytanie za pomocą strumienia pliku
            FileReader fr = new FileReader("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 27\\src\\liczba.txt");
            int val;
            //tak długo aż zmienna val nie będzie = -1...
            while ((val = fr.read()) != -1)
                //val musi być w postaci 0 lub 1 - tak jak jest to okreslone w zadaniu


                //do result przypisujemy wartość result przesuniętą o 1 bit w lewo — z prawej strony uzupełni się to wartością 0

                //dlatego poddajemy to konkatenacji — z wartością val, od której odjęliśmy 0

                //dzięki temu będziemy mieli do dyspozycji tylko element odpowiedzialny za wartość 0 albo 1
                result = (result << 1) | (val - '0');
            //zamkniecie strumienia
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
