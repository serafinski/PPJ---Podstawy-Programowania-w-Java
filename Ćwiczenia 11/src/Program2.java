public class Program2 {
    public static void main(String[] args) {

        char[] arr = {'T','J','S'};

        int  minIndex = 0; // to jest założenie, które sobie robimy

        for(int i=1;i<arr.length;i++){
        if(arr[minIndex] > arr[i]){
            minIndex = i;
        }

        }
        System.out.println("min index" + minIndex + "\t value: " +arr[minIndex]);
    }
}
