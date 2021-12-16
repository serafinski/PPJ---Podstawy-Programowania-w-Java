public class Program1 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,4,3,2,1};

        int bIndex = 0; // początkowy index
        int eIndex = tab.length-1; // końcowy index

        while (tab[bIndex] == tab[eIndex] && bIndex < eIndex){
            bIndex++;
            eIndex--;
        }

        System.out.println(bIndex >= eIndex);
        //for (; tab[bIndex] == tab[eIndex] && bIndex < eIndex;) -> tak najprosciej to zrobić z for
    }
}
