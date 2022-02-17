import java.util.Scanner;

public class Zadanie5_Task2704 {
    public static void main (String args[]){
        //wczytywanie danych z klawiatury
        Scanner scan = new Scanner(System.in);
        //zapisanie odczytanej wartości w jakimś wrt
        int wrt = scan.nextInt();

        System.out.println(convertToSystem(wrt,2));
        System.out.println(convertToSystem(wrt,4));
        System.out.println(convertToSystem(wrt,8));
        System.out.println(convertToSystem(wrt,16));
    }

    //funkcja zamieniająca na system podaną liczbę
    private static String convertToSystem(int value, int system){
        //rozwiązuje problem wyboru systemu
        switch(system){
            case 2,4,8,16: break ;
            //wyrzuć wyjątek, jeżeli będzie zły system
            default: throw new IllegalArgumentException();
        }

        //w tym będzie zapisywana wartość
        String str = "";

        //int z pierwiastka z podanego systemu to dana potęga
        int pow = (int)Math.sqrt(system);


        for(int i=0;i<31;i+=pow){
            //przesunięcie wartości o i bitów i konkatenacja z wybranym systemem-1

            // interesuje nas jeden bit informacji — a nie bajt
            int tmp = ((value>>i) & (system-1));

            //na początku dostajemy jakby "odwróconą" wartość -> niwelujemy to za pomocą dodania str,

            //rozwiązanie problemu systemu 16-kowego - gdzie wartości mogą być przyjmowane do 15 -> czyli do F
            str = tmp < 10 ? tmp + str : (char)('A'+(tmp-10))+ str;
        }
        return str;
    }
}
