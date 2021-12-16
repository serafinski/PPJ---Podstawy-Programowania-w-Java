public class Program2 {
    public static void main(String[] args) {
        int[] tab1 = new int[4];
        int[] tab2 = new int[5];

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * 10);
            System.out.print(tab1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = (int) (Math.random() * 10);
            System.out.print(tab2[i]+ " ");
        }
        System.out.println();
        tabele(tab1,tab2,1);
    }
    public static void tabele(int[] tab1, int[] tab2, int arg){
    int[] merge = new int[tab1.length+ tab2.length];
    int counter =0;
    for(int element: tab1){
        merge[counter]= element;
        counter++;
    }
    for(int element: tab2){
        merge[counter]=element;
        counter++;
    }
    for(int i=0; i<merge.length;i++)
        System.out.print(merge[i]+" ");

    //for()
    }

}