public class Program3 {
    public static void main(String[] args) {

        int size = (int)(Math.random()*20);
        int[] tab1 = new int[size];
        double[] tab2 = new double[size];

        for(int i = 0; i < size; i++){
            tab1[i]=((int)(Math.random()*100));
            tab2[i]=(Math.random()*100);
        }
        System.out.print("[");
        for(int val : tab1)
            System.out.print(" "+ val);
        System.out.println("]");

        System.out.print("[");
        for (double val : tab2)
            System.out.print(" " + val);
        System.out.println("]");

        for (int i =0; i < size; i++){
            int minIndex = i;
            for (int j = i+1; j<size; j++){
                if (tab1[minIndex]+tab2[minIndex]> tab1[j]+ tab2[j])
                    minIndex = j;
            }
            {
                int tmp = tab1[i];
                tab1[i] = tab1[minIndex];
                tab1[minIndex] = tmp;

            }
            {
                double tmp = tab2[i];
                tab2[i] = tab2[minIndex];
                tab2[minIndex] = tmp;

            }
        }
        System.out.print("[");
        for(int val: tab1)
            System.out.print(" "+ val);
        System.out.println("]");

        System.out.print("[");
        for(double val: tab2)
            System.out.print(" "+val);
        System.out.println("]");
    }
}
