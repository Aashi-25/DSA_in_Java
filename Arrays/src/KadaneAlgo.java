import java.util.Arrays;

public class KadaneAlgo {
    //used for printing maximum subarray sum
    public static void main(String[] args) {
        int[] arr = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
        System.out.println(MaxSum(arr));
        System.out.println(Arrays.toString(PrintMax(arr)));
    }
    static int MaxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    static int[] PrintMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(sum == 0){
                start = i;
            }
            sum += arr[i];
            if(sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0){
                sum=0;
            }
        }
        int[] result = new int[ansEnd - ansStart + 1];
        for(int j=0 , i=ansStart ; i<=ansEnd; i++,j++){
            result[j] = arr[i];
        }
        return result;
    }
}
