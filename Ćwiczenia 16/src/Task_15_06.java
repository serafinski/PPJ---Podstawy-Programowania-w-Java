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
        int one = arr1.length;
        int two = arr2.length;

        if(one != two){
            return false;}

        for (int i =0; i< arr1.length; i++)
            if(arr1[i]!=arr2[i])
                return false;

        for (int i =0; i< arr1.length; i++)
            for(int j=0; j< arr1[i].length;i++)
                if(arr1[i][j] != arr2[i][j])
                    return false;
        return true;
    }
}
