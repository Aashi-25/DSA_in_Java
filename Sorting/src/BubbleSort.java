import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {50 , 40 , 30 , 20 , 10};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }
    static int[] BubbleSort(int[] arr){
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=1 ; j<arr.length-i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
