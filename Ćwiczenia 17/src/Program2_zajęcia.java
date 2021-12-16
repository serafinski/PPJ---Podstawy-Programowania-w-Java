public class Program2_zajęcia {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }
    public static boolean isArmstrongNumber(int val){
        int[] arr = Program1.splitToDigits(val); // rozbicie na cyfry pozwala nam na stwierdzenie ile jest cyfr
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            int pow = arr[i];
            for(int j=1; j<arr.length; j++)
                pow *=arr[i];
            sum += pow;
        }
        return val == sum;
    }
}

/*
moje rozwiązanie

public class Program2 {
    public static void main(String[] args) {
    int number = 153; //LA
    int number2= 333; //N LA
        System.out.println(isArmstrongNumber(number));
        System.out.println(isArmstrongNumber(number2));
    }
    public static boolean isArmstrongNumber(int val){
        int countDigits = 0;
        int tmp = val;
        while (tmp>0){
            tmp /= 10;
            countDigits++;
        }

        int sum = 0;
        tmp = val;
        while (tmp>0){
            int digit = tmp%10;
            int pow = digit;
            for(int j =1; j<countDigits; j++)
                pow*=digit;
            sum+=pow;
            tmp/=10;
        }
        if (val != sum)
            return false;
        return true;

    }
}

 */
