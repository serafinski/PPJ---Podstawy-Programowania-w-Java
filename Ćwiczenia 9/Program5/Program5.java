public
    class Program5{
        public static void main(String[] args){
            System.out.println("Wpisz swój numer studenta");
            java.util.Scanner in1 = new java.util.Scanner(System.in);
            int numer = in1.nextInt();
            long suma = 0;
            for (int counter = numer ; counter > 0 ;counter--)
                suma = suma + counter;

            System.out.println("Suma wynosi: "+ suma);
        
        //////////////////
        int sum =0;
        for(int i=0;i< numer; i++){sum += i;};
        System.out.println();
    /////////////////
    sum = 0;
    while (numer > 0){
        sum += numer %10;
        number/=10;
    }
    System.out.println();
        }

    }