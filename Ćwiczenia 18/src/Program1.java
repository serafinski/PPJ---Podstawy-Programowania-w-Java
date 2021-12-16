public class Program1 {
    public static void main(String[] args) {
        System.out.print("[");
        for(int val : splitToDigits(1701))
            System.out.print(" "+ val);
        System.out.println("]");
    }
    public static int[] splitToDigits(int val){
        if (val<=0)
            return  new int[0];
        int countDigits = 0,
            tmp = val;
        while (tmp!=0){
            tmp /= 10;
            countDigits++;
        }
        int [] res = new int[countDigits];

        tmp = val;
        while (tmp !=0){
            res[--countDigits] = tmp %10;
            tmp /=10;
        }
        return res;
    }
}

