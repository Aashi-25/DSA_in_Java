import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {70 , 20 , 50 , 10};
        for(int i=0 ; i<arr.length ; i++){
            int maxIdx = 0;
            for(int j=1; j<=arr.length-1-i ; j++){
                if(arr[j] > arr[maxIdx]){
                    maxIdx = j;
                }
            }
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
