public class Program5 {
    public static void main(String[] args) {
        //int[] tab1 = new int[(int)Math.random()*10];
        //int[] tab2 = new int[(int)Math.random()*10];
        //int[] tab3 = new int[(int)Math.random()*10];

        int[] tab1 = {10, 20,30};
        int[] tab2 = {40,50};
        int[] tab3 = {5};

        int [][] tab = {tab1, tab2, tab3};

        for(int i=0; i<tab.length; i++) {
            System.out.print("[");
            for (int val :tab[i])
                System.out.print(" "+ val);
            System.out.println("]");
        }

        /*for(int i =0; i< tab1.length; i++){
            tab1[i] = ((int)Math.random()*100);
        }

        for(int i =0; i< tab2.length; i++){
            tab2[i] = ((int)Math.random()*100);
        }

        for(int)*/
    }
}
