public class Program3 {
    public static void main(String[] args) {
        System.out.println("Tablica:");
        // utworzenie tablicy
        long[] arr = new long[5];
        // wypełnienie tablicy liczbami
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] +", ");
        }
        System.out.println();
        // losowanie 2 indeksów
        int counter1 = 0;
        do {
            System.out.println("Wylosowane indeksy: ");
            int[] los = new int[2];
            int idx1 = 0;
            int idx2 = 0;
            do {
                idx1 = (int) (Math.random() * 5);
                idx2 = (int) (Math.random() * 5);
            } while (idx1 == idx2);
            los[0] = idx1;
            los[1] = idx2;


        /* int counter = 0;
        do{
        for (int i = 0; i < los.length; i++) {
            los[i] = (int) (Math.random() * 5);
            if(los[0]==los[1]){
                counter = 1;}
            System.out.println("Index: "+ los[i] + " - "+"Liczba: "+(los[i]+1));
            }
        }
        while (counter==0); */

            for (long elementy : los) {
                System.out.print(elementy+", ");
            }

            System.out.println();

            // inicjujemy 2 wartością wylosowaną
            long abc = arr[los[1]];
            //System.out.println("to będzie przypisane do zmiennej (index 2) - " + abc);
            // zamiana wartości 1 indeksu na wartość 2 indeksu
            //System.out.println("wartość dla 1 indeksu - przed - " + arr[los[1]]);
            arr[los[1]] = arr[los[0]];
            //System.out.println("wartość dla 2 indeksu - " + arr[los[1]]);
            //System.out.println("wartości dla 1 indeksu po update'cie - " + arr[los[0]]);
            // nadanie wartości zapisanej w abc 1 wartości wylosowanej przez indeks
            arr[los[0]] = abc;
            //System.out.println(abc);

            System.out.println("Po zamianie:");
            for (long elementy : arr) {
                System.out.print(elementy + ", ");
            }
            System.out.println();

            // zamienianie wartości tak długo aż w tablicy są wartości sąsiadujące
            int counter2 = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if ((arr[j] + 1 != arr[j + 1]))
                    counter2++;
                else
                    counter2 = 0;

                if (counter2 == arr.length - 1)
                    counter1 = 1;
            }
        }
        while (counter1==0);







    }
}

