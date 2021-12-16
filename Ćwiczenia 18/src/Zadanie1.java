import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] tab,int source,int destination){
        int tmp = tab[destination];
        tab[destination] = tab[source];
        tab[source]=tmp;
    }
}
