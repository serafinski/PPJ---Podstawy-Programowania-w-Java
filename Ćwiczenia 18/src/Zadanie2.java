import java.util.Arrays;

public class Zadanie2 {
    public static void main(String[] args) {
        int[] tab = {1,3,4,2,3,6,9,3};

        bubbleSortIt(tab); // użyj metody
        System.out.println(Arrays.toString(tab)); // skonwertuj tablice na String i wypiszą ją
    }
    private static void bubbleSortIt(int [] arr){ // zadaniem tej metody jest posortowanie tablicy

        // długość-1 - bo nie możemy wyjść poza tablice

        for (int j = 0; j< arr.length-1; j++){ // zapewnia ustawienie elementów w odpowiedniej kolejności — w przypadku sytuacji gdzie po zamianie miejscami wciąż byłby przypadek, gdzie poprzednia jest większa od następującego

            //[2] dlatego odejmujemy od długości tabeli dodatkowo jeszcze j -> bo nie ma sensu tego sprawdzać

            for(int i =0; i< arr.length-1-j; i++) // zapewnia "przepchnięcie" największego elementu na sam koniec

                //[1] poniższy blok gwarantuje, że największy element znajduje się na ostatniej pozycji

                if(arr[i] > arr[i+1]) // jeżeli wartość poprzedzająca będzie większa od następującego
                    Zadanie1.swap(arr, i , i+1); // używamy metody z Zadania1 (Task 1702)
        }
    }
}
