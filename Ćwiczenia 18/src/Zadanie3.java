import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] tab = {1,3,4,2,3,6,9,3};
        bubbleSortRe(tab, tab.length);
        System.out.println(Arrays.toString(tab));
    }
    public static void bubbleSortRe(int[] arr, int len){ // do metody chcemy dostarczyć informacje o tabeli i jej długości
        for(int i =0; i<len-1; i++) // len-1, bo patrzymy do przodu i nie możemy wyjść poza tablice
            if(arr[i]>arr[i+1]) // jeżeli wartość poprzedzająca będzie większa od następującego
                Zadanie1.swap(arr, i, i+1); // używamy metody z Zadania1 (Task 1702)

        // warunek sprawiający, że nie robimy ostatniego elementu — bo wiemy, że będzie największy

        if(len-1>1) // jeżeli długość tablicy (patrząc 1 do przodu — czyli z odjęciem 1) jest większa od 1
            bubbleSortRe(arr, len-1); // rekurencja — zrób to samo, ale dla długości-1
    }
}
