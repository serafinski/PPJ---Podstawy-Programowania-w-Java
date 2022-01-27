import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//bez przesunięcia bitowego :(((((((( - nie mam koncepcji...

public class Zadanie6_PD {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 27\\src\\liczba.txt");
            StringBuilder sb = new StringBuilder();
            int val;
            char znak;
            while((val = fis.read()) != -1){
                znak = (char)val;
                sb.append(znak);
            }
            System.out.println(sb);
            String tekst = sb.toString();

            byte[] tab = tekst.getBytes();

            StringBuilder sb2 = new StringBuilder();
            for(int i=0; i<tab.length; i++){
                sb2.append(tab[i]);
            }
            System.out.println(sb2);

            String koncowy = sb2.toString();

            FileOutputStream fos = new FileOutputStream("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 27\\src\\liczba_zmieniona.txt");
            fos.write(koncowy.getBytes(StandardCharsets.UTF_8));
            fos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
