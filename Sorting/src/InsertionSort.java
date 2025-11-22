import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5 , 4 , 3 , 2 , 1};
        //i stands for outer loop -> it represents number of passes -> for eg:- for i-0(first pass)..array till index 1 should be sorted
        for(int i=0 ; i<=arr.length-2 ; i++){
            for(int j=i+1; j>0 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
