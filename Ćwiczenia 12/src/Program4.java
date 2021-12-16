public class Program4 {
    public static void main(String[] args) {
        // sprawdzenie


        byte[] arr = {
                0,2,0,
                0,2,0,
                0,2,0
        };
        boolean win;
        byte res = 0;
        win = false;
        for (int i = 0; i < 3 && !win; i++){
            if (arr[(i*3)+0] == arr[(i*3)+1] && arr[(i*3)+1]==arr[(i*3)+2]) {
                win = true;
                res = arr[(i*3)+0];
            }
            if (arr[(0*3)+i] == arr[(1*3)+i] && arr[(1*3)+i] == arr[(2*3)+i]) {
                win = true;
                res = arr[(0*3)+i];
            }
        }
    }
}
