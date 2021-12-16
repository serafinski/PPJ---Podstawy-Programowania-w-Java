public class Program4 {
    public static void main(String[] args) {
        int [ ] [ ] tab = {
                {1 , 0 , 0 , 0 , 0} ,
                {0 , 1 , 0 , 0} ,
                {0 , 0 , 1}
        };
        int countSize =0;
        for (int i=0; i< tab.length; i++){
            countSize+= tab[i].length;
        }

        int[] res = new int[countSize];

        countSize = 0;
        for (int i=0; i< tab.length; i++)
            for(int j=0; j<tab[i].length; j++)
                res[countSize++]= tab[i][j];
        }
    }

