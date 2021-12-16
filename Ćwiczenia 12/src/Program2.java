public class Program2 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10];
        for(int i=0; i< args.length; i++)
            arr[i] = Math.random()<0.5 ? true : false;
        int counT = 0;
        for(int i =0; i<arr.length; i++)
            if(arr[i])
                counT++;

        boolean[] arrT = new boolean[counT];
        boolean[] arrF = new boolean[arr.length-counT];

        for(int i =0; i< arrT.length; i++)
            arrT[i] = true;

        for(int i =0; i< arrF.length; i++)
            arrF[i]=false;
    }
}
