import java.util.Arrays;

public class Program3 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(calculateSquares(10, 10, 2)));
    }
    public static int[][] calculateSquares(int screenWidth,int screenHeight, int side){
        int[][] res = new int [(screenHeight/side)*(screenWidth/side)][(2)];

        for(int i=0, count=0; i< screenHeight; i+= side)
            for(int j=0; j<screenWidth; j+= side){
                res[count][0] = i;
                res[count][1] = j;
                count++;
            }
        return res;
    }
}
