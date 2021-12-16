public class Prog_zaj_5 {
    public static void main(String[] args) {

        int tmpSize = (int)(Math.random()*20);
        int[] arr1 = new int[tmpSize];

        for(int i = 0; i<arr1.length; i++)
            arr1[i]=(int)(Math.random()*100);

        tmpSize = (int)(Math.random()*20);
        int[] arr2 = new int[tmpSize];

        for(int i = 0; i<arr2.length; i++)
            arr2[i]=(int)(Math.random()*100);


///////////////////////////////////////////////////
        int[] res1 = new int[arr1.length+arr2.length];
        int count = 0;
        for (int i = 0; i< arr1.length;i++)
            res1[count++] = arr1[i];

        for (int i = 0; i < arr2.length; i++)
            res1[count++]=arr2[i];

///////////////////////////////////////////////////
        int countSame = 0;
        for(int i=0; i< arr1.length; i++)
            for(int j =0; j<arr2.length; j++)
                if(arr1[i] == arr2[j])
                    countSame++;

        int[] res2 = new int[countSame];
        countSame = 0;
        for(int i=0; i< arr1.length; i++)
            for(int j =0; j<arr2.length; j++)
                if(arr1[i] == arr2[j])
                    res2[countSame++]=arr1[i];
/////////////////////////////////////////////////
        int minValue = arr1[0],
            maxValue = arr1[0];

        for(int i=1; i< arr1.length; i++) {
            if (minValue > arr1[i])
                minValue = arr1[i];
            if (maxValue < arr1[i])
                maxValue = arr1[i];
        }
        for(int i=0; i< arr2.length; i++) {
            if (minValue > arr2[i])
                minValue = arr2[i];
            if (maxValue < arr2[i])
                maxValue = arr2[i];
        }

        int[] res3 = new int[maxValue - minValue + 1];
    }
}
