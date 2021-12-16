public class Program1 {
    public static void main(String[] args) {
        double[] tab = new double[10];
        //1
        for (int i = 0; i<tab.length;i++){
            tab[i] = Math.random();
            //System.out.println(i + " " + tab[i]);

            /* for(double d : tab)
                System.out.print(d+", "); */
            }
        //2 advanced FOR!!!
        int counter = -1;
        for (double d : tab){
            counter++;
            System.out.println(counter+ " " + d + " ");
        }
        System.out.println("||||||||||||||||||||||||||");
        //3
        for(int i =2; i<tab.length; i+=2){
            System.out.println(tab[i]+", ");
        }
        System.out.println("||||||||||||||||||||||||||");
        //4
        for (double d: tab){
            if( ((int)d)% 2 ==0){
                System.out.println(d);
            }
        }
        }
    }
