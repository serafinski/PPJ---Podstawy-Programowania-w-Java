import java.util.Arrays;

public class Program2_zajęcia {

    //PODEJŚCIE NR 3 - NAJCZĘSTSZY SPOSÓB WG. DR TOMASZEWSKIEGO!
    //Tworzymy zmienne w przestrzeni klasy, a nie w przestrzeni metody!!!

    static final int GREATER = 1; //final -> wartość elementu nie będzie ulegała zmianie — jest stałą (konwencja DUŻE LITERY)
    static final int LOWER = -1;

    public static void main(String[] args) {

        int[] tab1 ={10,20,30,40,50};
        int[] tab2 ={30,20,10};

        System.out.println(Arrays.toString(task05(tab1, tab2, -1)));

    }


//////////////////////////////////////////////////////////////////////

    //METODA DR TOMASZEWSKIEGO - COŚ NIE DZIAŁA :(

    /*
    public static int[] task05(int[] arr1, int[] arr2, int state) {
        if (arr1.length > arr2.length) {
            //powinniśmy użyć sposobu dla 2 przypadku — ale chcielibyśmy użyć tego dla 1 przypadku
            int[] tmp = arr1;
            arr1 = arr2;
            arr2 = tmp;
        }
        int[] res;
        return switch (state) {
        case GREATER -> {
            res = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++)
                res[i] = arr1[i] + arr2[i];
            yield res;
        }
        case LOWER -> {
            res = new int[arr1.length - arr2.length];
            for (int i = arr2.length, j = 0; i < arr1.length; i++)
                res[j++] = arr1[i];
            yield res;
        }
            default -> null;
        };
    }

     */

//////////////////////////////////////////////////////////////////////
    //LEPSZY DOPUSZCZALNY ZAPIS - BEZ POWTÓREK


    public static int[] task05(int[] arr1, int[] arr2, int state){
        if(arr1.length == arr2.length)
            return null;
        if(arr1.length> arr2.length){
            //powinniśmy użyć sposobu dla 2 przypadku — ale chcielibyśmy użyć tego dla 1 przypadku
            int[] tmp = arr1;
            arr1 = arr2;
            arr2=tmp;
        }
        int[]res; //deklarowany w wielu miejscach — dlatego ekstrakcja na zewnątrz
        if(state<0){
            res = new int[arr1.length];
            for(int i=0;i<arr1.length;i++)
                res[i] = arr1[i]+arr2[i];
        }
        else{
            res = new int[arr1.length-arr2.length];
            for(int i= arr2.length, j=0; i<arr1.length;i++)
                res[j++] = arr1[i];
        }
        return res;
    }


//////////////////////////////////////////////////////////////////////

    /*
    DZIAŁA ALE NIE ŁADNY ZAPIS - BO POWTARZAMY KOD!

    public static int[] task05(int[] arr1, int[] arr2, int state){
        if(arr1.length == arr2.length)
            return null;
        if(state<0){
            if(arr1.length < arr2.length){
                int[] res = new int[arr1.length];
                for(int i=0;i<arr1.length;i++)
                    res[i] = arr1[i]+arr2[i];
                return res;
            }
            else{
                int[]res = new int[arr2.length];
                for(int i=0; i< arr2.length;i++)
                    res[i]=arr2[i]+arr1[i];
                return res;
            }
        }
        else{
            if(arr1.length< arr2.length){
                int[] res = new int[arr2.length-arr1.length];
                //zaczynamy od arr1.length — bo elementy ponad długość arr1 zaczynają się za nią
                for(int i =arr1.length, j =0; i< arr2.length; i++) // res też potrzebuje indeksu — dlatego j
                    res[j++] = arr2[i]; //za każdym razem zwiększamy indeks res
                return res;
            }
            else {
                int[] res = new int[arr1.length-arr2.length];
                for(int i= arr2.length, j=0; i<arr1.length;i++)
                    res[j++] = arr1[i];
                return res;
            }
        }
    }

     */
}
