public class Program4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 17;
        int c = 2;

        System.out.println(findMax(a,b,c));
    }

    public static int findMax(int val1, int val2, int val3){
        if (val1>val2 && val2>val3)
            return val1;
        if (val1<val2 && val2>val3)
            return val2;
        return val3;
    }
}
