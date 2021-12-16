public class Program4 {
    public static void main(String[] args) {
        int tmpSize = 10 + (int)(Math.random()*5);
        int[] arr = new int[tmpSize];

        for(int i =0; i<arr.length; i++)
            arr[i] = i;

        System.out.print("[");
        for(int val:arr)
            System.out.print(" "+ val);
        System.out.print("]");

        System.out.println(); // przełamanie linii
////////////////////////////////////////

        // tutaj trzeba sobie założyć
        for (int i =0; i<arr.length*3;i++){
            int startIndex = (int)(Math.random()* arr.length);
            int endIndex = (int)(Math.random()* arr.length);

            int tmp = arr[startIndex];
            arr[startIndex]=arr[endIndex];
            arr[endIndex]= tmp;
        }
        System.out.print("[");
        for(int val:arr)
            System.out.print(" "+ val);
        System.out.print("]");
        System.out.println();
/////////////////////////////////////////
        for (int i=0; i< arr.length; i++){
            for (int j =0; j < arr.length;j++)
                System.out.print(
                        arr[j] == i ? "*":"."
                );
            System.out.println();
        }
    }
}
