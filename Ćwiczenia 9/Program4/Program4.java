public class Program4 {

    public static void main(String[] args) {
    System.out.println("Wpisz liczby");
	java.util.Scanner in1 = new java.util.Scanner(System.in);
    int sum = 0;    
    int number = in1.nextInt();
    int licznik = 0;


    while(number !=0){
        sum += number;
        licznik ++;
        number = in1.nextInt();
        
    }
    System.out.println("Suma to: "+ sum);
    System.out.println("Liczba operacji to: "+ licznik);
    //////////////////////////
    /*
    int sum2 = 0;    
    int number2;


    while((number2 = scan.nextInt())!=0)
        sum2 += number2;
        System.out.println(sum2);
    */
    }
}
