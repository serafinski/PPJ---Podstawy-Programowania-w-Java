//debbug this shit
public class Program1 {
    public static void main(String[] args) {
        int[][] tab = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10,11,12},
                {13,14,15,16}
        };
        int[][] vec = {
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };

        int i=0;
        int j=0;
        int turn = 0; // ile skrętów do tej pory
        int endCount = 0; // zapętlenie w jedym miejscu
        while (endCount<4){
            //System.out.print(tab[i][j]+" ");
            if (

                            j+vec[turn%4][1]<tab[0].length && //czy jeżeli dodamy do j wartość 1 z wektora (wyjście poziomo)
                            i+ vec[turn%4][0]< tab.length && // czy nie wyszliśmy poza element (pionowo)
                            j+ vec[turn%4][1]>=0 && // bo zerujemy
                            i+ vec[turn%4][0]>=0 &&
                            tab[i+vec[turn%4][0]][j+vec[turn%4][1]]!=0//
            ){
                System.out.print(tab[i][j]+" ");
                tab[i][j]=0;
                endCount=0; // reset przy każdym kroku!
                i += vec[turn%4][0];
                j += vec[turn%4][1];
            }
            else{
                turn++;
                endCount++;
            }
        }
        System.out.print(tab[i][j]);
    }
}
