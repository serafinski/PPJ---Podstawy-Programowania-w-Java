public class Program2 {
    public static void main(String[] args) {
        int[] arr = {153, 333, 370, 515, 407, 80};
        int val = 0;

        for (int i=0; i < arr.length; i++) {
            val = arr[i];

            int countDigit = 0;
            int tmp = val;

            while (tmp > 0) {
                tmp /= 10;
                countDigit++;
            }
            System.out.println(val + " składa się z " + countDigit + " cyfr");

            int sum = 0;
            tmp = val;
            while (tmp > 0) {
                int digit = tmp % 10;
                int pow = digit;
                for (int j = 1; j < countDigit; j++)
                    pow *= digit;

                sum += pow;

                tmp /= 10;
            }
            if (val == sum)
                System.out.println("AN");
            else
                System.out.println("Not AN");
        }
    }

}
