import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,6,4};
//        System.out.println(SortedArray(arr));
        int low = 0;
        int high = arr.length-1;
        System.out.println(Arrays.toString(MergeSort(arr, low, high)));
    }
    static int[] MergeSort(int[] arr , int low , int high){
        if(low >= high){ //base condition
            return arr;
        }
        int mid = low + (high-low)/2;
        MergeSort(arr , low , mid);
        MergeSort(arr , mid+1 , high);
        Merge(arr , low , mid , high);
        return arr;
    }

    static int[] Merge(int[] arr, int low , int mid , int high){
//        int[] temp = new int[arr.length];
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low ; i<=high ; i++){
            arr[i] = temp.get(i-low);
        }
        return arr;
    }
}
