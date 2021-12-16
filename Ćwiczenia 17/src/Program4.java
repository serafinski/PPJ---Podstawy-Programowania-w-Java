public class Program4 {
    public static void main(String[] args) {
        java.util.Scanner in1 = new java.util.Scanner(System.in); //scanner
        System.out.print("Wprowadź słowo: ");

        //wprowadź tomek - by był false

        // wprowadź anilina - by było true

        String input = in1.nextLine(); //skanują wprowadzoną linijkę

        //System.out.println("Wprowadzone słowo to: " + input);

        char[] tab = input.toCharArray(); // konwersja słowa do tablicy char

        /*for(int i =0; i< tab.length; i++)
            System.out.println(tab[i]);
         */

        System.out.print("Czy słowo jest palindromem: ");
        System.out.println(funPaliRec(tab,0)); // wywołanie metody
    }
    public static boolean funPaliRec(char[] arr,int index){
        if(arr[index] != arr[arr.length-1-index]) // jeżeli litera na pozycji index nie równa się literze - 1 - index
            return false; // zwróć fałsz
        if (index> arr.length/2) // jeżeli indeks jest większy niż połowa długości tabeli
            return true; // zwróć prawdę
        return funPaliRec(arr,index+1);// zrób to samo, ale na indeksie większym o 1
    }
}
