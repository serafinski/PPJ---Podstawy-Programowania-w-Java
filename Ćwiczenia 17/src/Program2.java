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
