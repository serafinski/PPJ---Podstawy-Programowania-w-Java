import java.util.Arrays;

public class Zadanie4 {
    public static void main(String[] args) {
        java.util.Scanner in1 = new java.util.Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        int input = in1.nextInt();
        //konwersja int na tabele
        int[] tab = Program1.splitToDigits(input); // odwołanie do Program1 (Task 1601 - poprzednie ćwiczenia)

        System.out.println("Wybrana liczba to: " + input);

        System.out.println("Permutacje to: ");
        perm(tab, tab.length); // wywołanie metody

    }
    private static void perm(int[] tab, int length){ // dostarczamy dane i ile elementów jest do permutowania

        // kiedy mamy 1 element — permutacja nie ma sensu
        if(length == 1){
            System.out.println(Arrays.toString(tab));
            return;
        }

        // blokowanie elementów
        for (int i=0; i<length; i++){
            // w różnych momentach — chcemy umieścić różne wartości

            //bez poniższej operacji — powtórka wszystkich wartości x2

            Zadanie1.swap(tab,i,length-1); // wykonanie operacji "na dzień dobry"

            //bez poniższej operacji — nic się nie zwraca, bo nie ma rekurencji
            perm(tab, length-1); // rekurencja — wyciągamy tylko część tablicy (określoną przez tab-1)
            // OSTATNI ELEMENT JEST ZAMROŻONY — NIE ZMIENIA SIĘ

            //bez poniższej operacji — ponownie powtórka wszystkich wartości x2
            Zadanie1.swap(tab,i,length-1); // wykonanie operacji "z powrotem"
        }
    }
}
