import java.util.Arrays;

//this type of technique used for positive nos including 0 and where smaller values are there..range of min and max num is less
public class CountSort {
    public static void main(String[] args) {
        int[] arr={2 , 5 , 6 , 7 , 3 , 2 , 2 , 1 , 5 , 3 , 5};
        System.out.println(Arrays.toString(CountSort(arr)));
    }
    static int[] CountSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            largest = Math.max(arr[i] , largest);
        }
        int[] count = new int[largest+1];

        for(int i=0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0 ; i<count.length ; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    return arr;
    }
}
