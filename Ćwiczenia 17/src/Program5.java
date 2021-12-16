public class Program5 {
    public static void main(String[] args) {
        java.util.Scanner in1 = new java.util.Scanner(System.in); //scanner
        System.out.print("Wprowadź słowo: ");

        //wprowadź tomek - by był false

        // wprowadź anilina — by był palindrom z usuniętą jedną literą — bo 7-literowe słowo

        String input = in1.nextLine(); //skanują wprowadzoną linijkę

        System.out.println("Wprowadzone słowo to: " + input);
        char[] tab = input.toCharArray(); // konwersja słowa do tablicy char

        System.out.print("Słowo od środka: ");
        System.out.println(wewnatrz(tab)); // wywołanie metody głównej metody
    }
    public static char[] wewnatrz (char[] arr){ // Metoda dostająca tablice i oddająca zmienioną tablice (wg. polecenia)
        char[] res = new char[(arr.length % 2 != 0 ? arr.length-1 : arr.length)]; // jeżeli ilość elementów jest nieparzysta, odejmij 1, jeżeli parzysta nie odejmuj
        for(int i = 0, j=0; i<arr.length; i++){
            if(res.length == arr.length || i != arr.length/2){ // jeżeli wprowadzona tablica jest parzysta lub "i" nie równa się połowie długości tabeli wejściowej
                res[j]=arr[i]; // wtedy wartość tabeli res na danym indeksie jest taka sama jak wartość tabeli wejściowej na tym samym numerze indeksu
                j++;
            }
        }
        wewnatrzRec(res,0); // wywołanie metody rekurencyjnej
        return res; //zwróć tabele res
    }
    public static void wewnatrzRec(char [] arr, int index){// Metoda niezwracająca nic, przyjmująca tabele i indeks
        if(index +1 == arr.length/2) // jeżeli indeks + 1 jest równy długości połowie tabeli
            return; // skończ
        char tmp = arr[index]; // nadajemy tmp wartość tablicy od indeksu
        arr[index]= arr[arr.length/2-1-index]; // zmieniamy wartość tablicy na danym indeksie na wartość na indeksie o połowie mniejszym - 1 - indeks
        arr[arr.length/2-1-index]=tmp; // zamieniamy wartości ze sobą — tmp wędruje w miejsce właśnie zmienionego indeksu

        // ten sam przypadek, ale tym razem od końca

        tmp = arr[arr.length-1-index]; // nadajemy wartość tmp wartości tablicy od indeksu
        arr[arr.length-1-index] = arr[arr.length/2]; // zmieniamy wartość tablicy - 1 - index na danym indeksie na wartość na indeksie o połowie mniejszym
        arr[arr.length/2] =tmp; //ponownie zamieniamy wartości ze sobą — tmp wędruje w miejsce właśnie zmienionego indeksu

        wewnatrzRec(arr,index+1); // rekurencja — do momentu wyjścia, czyli kiedy index + 1 == arr.length/2
    }
}
