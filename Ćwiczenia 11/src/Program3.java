import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        /*
        char [] tab = new char [5];

        for(int i=0;i<tab.length;i++) {
            // *26 - zakres losowania; +97 zwiększamy zakres, bo 'a' zaczyna się od 97
            tab[i] = (char)(Math.random()*26+97);
            System.out.println(i+ " "+ tab[i]);
        }
        System.out.println("Wprowadz znak z klawiatury");
        java.util.Scanner in = new java.util.Scanner(System.in);
        char c = in.next().charAt(0);*/
//////////////////////////////////////////////
        char [] arr = new char [5];

        for(int i=0; i< arr.length; i++){
            arr[i]=(char)(Math.random()*('Z'-'A')+'A');
        }

        System.out.println("[");
        for(char val : arr)
            System.out.println(""+ val);
        Scanner scan = new Scanner(System.in);

        char chr = scan.next().charAt(0);
        boolean zerosFill = false;

        while (chr !=0 && !zerosFill){
            int count = 0;
            for (int i=0; i< arr.length; i++){
                if(arr[i]==chr){
                    arr[i]=0;
                    count++;
                }
            }
            System.out.println(chr + " "+count);

            int countZeros = 0;
            for(int val:arr)
                if(val==0)
                    countZeros++;

            zerosFill = countZeros == arr.length-1;
            chr = scan.next().charAt(0);
        }
    }
}
