public class Program1 {
    public static void main(String[] args) {
        //tablica char znaków nie zawiera kompletu znaków — a tylko wybrane
        //więc tylko wybrane powinny zostać wyświetlone
        char[] tab = "Ala ma kota".toCharArray(); // długość = 11

        countChars(tab);


    }
    public static void countChars(char[] arr){
        int[] res = new int['Z'-'A'+1];//miejsce na wszystkie znaki - 26 znaków
        for(int i=0; i< arr.length;i++){
            if(arr[i]>= 'A' && arr[i]<='Z') //jeżeli znak jest >= A oraz jest <= Z

                //jeżeli tutaj było A — to będzie A-A = 0 -> to odwołujemy się na 0-wy index tablicy res i zwiększamy go o 1
                res[arr[i]-'A']++;//zwiększamy wartość o 1 dla indeksu, któremu pasuje dana literka
            else
                if (arr[i]>= 'a' && arr[i]<='z')//ta sama sytuacja tylko z małymi literkami
                    res[arr[i]-'a']++;
        }

        //wypisujemy tylko te gdzie jest coś innego niż 0
        for(int i=0; i<res.length; i++)
            if(res[i] != 0) //jak jest = 0 w tablicy res — to taki znak nie wystąpił -> nie jest dla nas ważny
                System.out.println((char)('A'+i)+" - "+ res[i]);
    }
}
