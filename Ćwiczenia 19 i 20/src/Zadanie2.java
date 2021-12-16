import java.util.Arrays;

public class Zadanie2 {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        System.out.println(Arrays.toString(point2D.get()));
        //point2D.set(point2D.get());
    }
}
class Point2D{
    private int x;
    private int y;

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[][] get(){
        return new int[][]{{x},{y},{1}};
    }

    public void set (int[] tab){
        x = tab[0];
        y = tab[1];
        /*for(int i =0 ; i<tab.length; i++){
            if(x == tab[i])
                index_x = i;
            if(y == tab[i])
                index_y = i;
        }
        System.out.println("x znajduje się na pozycji: " + index_x + ", a y znajduje się na pozycji: " + index_y);
    */}
}
