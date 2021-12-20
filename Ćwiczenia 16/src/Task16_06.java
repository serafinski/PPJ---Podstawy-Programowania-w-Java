/*
Utwórz rekurencyjną metodę, która wypełni dowolną kwadratową tablicę zmiennych typu int w taki sposób,
aby kolejne wartości liczbowe na kolejnych wewnętrznych pierścieniach zwiększały się o jeden np:

11111111
12222221
12333321
12344321
12344321
12333321
12222221
11111111

 */

public class Task16_06 {
    public static void main(String[] args) {
        //na początku zauważamy, że zawsze będziemy mieć do czynienia z tablicą, która jest kwadratowa
        int size = 8;
        int[][] tab = new int[size][size];//dzięki temu na 100% - kwadrat

        fillArray(tab,0);
        printArray(tab);

    }
    //musimy zrobić sposób tak by tablice były wypełniane pierścieniowo

    // metoda przyjmuje tablice oraz poziom, od którego należy zacząć tablice
    public static void fillArray(int[][] arr, int level) {
        //chcemy mieć pierścienie — dlatego dodajemy level do int i = 0 oraz odejmujemy level od długości tablicy -> dzięki temu mamy 0XYX0
        for(int i=0+level; i< arr.length-level;i++) {
            //to samo dla wewnętrznej
            for (int j = 0+level; j < arr[i].length-level; j++) {
                //level + 1 - by nie było na zewnętrznym pierścieniu 0 - tylko 1-ki.
                arr[i][j] = level+1;
            }
        }
        //zwiększenie level

        // zwiększanie trzeba ograniczyć, bo inaczej wyjdziemy poza zakres...

        //jeżeli nie przekroczymy połowicznej części naszego wypełniania — to będzie OK.
        if(arr.length/2 > level)
            fillArray(arr,level+1); //rekurencja
    }

    //funkcja pomocnicza — wypisująca nam tablice
    public static void printArray(int[][] arr){
        //przechodzimy po tablicy — dlatego nie musimy dodawać/odejmować level'u — bo ta funkcja ma inne zadanie
        for(int i=0; i < arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]); //wyświetla nam elementy naszej tablicy
            }
            System.out.println();
        }
    }

}