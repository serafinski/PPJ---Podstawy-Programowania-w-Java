public class Program5 {
    public static void main(String[] args) {
        int [] tab1 = new int [5];
        int [] tab2 = new int [5];

        for(int i=0;i<tab1.length;i++) {
            tab1[i] = (int)(Math.random()*10);
            System.out.println("Tab1: "+ i+ " "+ tab1[i]);
        }
        for (int i=0;i< tab2.length;i++){
            tab2[i] = (int)(Math.random()*10);
            System.out.println("Tab2: "+ i+ " "+ tab2[i]);
        }
        //A
        int dlugosc = tab1.length + tab2.length;

        int [] polaczona = new int [dlugosc];

        int start = 0;
        for (int element: tab1){
            polaczona[start]= element;
            start++;
        }

        for (int element: tab2){
            polaczona[start]=element;
            start++;
        }

        for (int i=0; i< polaczona.length; i++)
            System.out.println("Polaczone: " + i + " "+ polaczona[i]);

        //B
        int pomocnicza = 0;
        int pomocnicza2 = 0;
        int[] tab3 = new int [5];
        for (int element : tab1){
            pomocnicza = tab1[element];
            for (int element2 : tab2){
                if (pomocnicza == tab2[element2]){
                        tab3[pomocnicza2] = tab2[element2];
                        System.out.println(tab3[pomocnicza2]);
                        pomocnicza2++;

                }
            }
        }
    }
}
