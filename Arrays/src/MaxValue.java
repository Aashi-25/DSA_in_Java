import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,2,30,4,5,6};
        System.out.println(Arrays.toString(arr));
        int max = 0;
        for (int i=0 ; i< arr.length ; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
