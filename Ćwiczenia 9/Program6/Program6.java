public class Program6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + 1 / Math.pow(2, i));
        } // tak mozna ale pojawi się później problem przy tym jak trzeba będzie zinplementować potęge

        
/////////////////////
        double sum = 0;
        int pow = i == 0 ? 1:2;
        for (int j = 1; j<i; j++){
            pow*=2;
        }
        sum += 1.0*pow; // wynik będzie jako double
        System.out.println(sum);
    }

}