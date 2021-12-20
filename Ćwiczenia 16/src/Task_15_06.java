/* Utwórz metodę jestRowna sprawdzającą czy dostarczone jako argumenty dwie dwuwymiarowe tablice (nie koniecznie prostokątne)
•mają takie same wymiary,
•spełniają warunek że a_{ij} = b_{ij} dla i= 0, . . . , m i j= 0, . . . , n

Metoda zwróci rezultat w postaci wartości logicznej true tylko gdy oba powyższe są spełnione jednocześnie
 */

public class Task_15_06 {
    public static void main(String[] args) {
    int[][] tab_a = {{1,2,3,4},{5,6,7,8}};
    int[][] tab_b = {{1,2,3,4},{5,6,7,8}};

    System.out.println(jestRowna(tab_a, tab_b));
    }
    public static boolean jestRowna(int[][] arr1, int[][] arr2){
        //warunek — czy rozmiar się zgadza
        if(arr1.length != arr2.length){
            return false;}

        //zabezpieczenie przed przypadkiem, gdzie elementy nie będą takiej samej długości — jeżeli chodzi o wnętrze tablicy

        //wewnętrzna tablica w arr1 musi być równa długością wewnętrznej tablicy w arr2 na tym samym indeksie
        for (int i =0; i< arr1.length; i++)
            if(arr1[i].length != arr2[i].length)
                return false;

        //sprawdzenie, czy wszystkie elementy są takie same
        for (int i =0; i< arr1.length; i++)
            for(int j=0; j< arr1[i].length;j++)
                if(arr1[i][j] != arr2[i][j]) //jeżeli elementy na tej samej pozycji nie są takie same zwracamy false
                    return false;
        //jeżeli opuścimy tę pętlę i nie zwrócimy wartości false -> musi być to prawda
        return true;
    }
}
