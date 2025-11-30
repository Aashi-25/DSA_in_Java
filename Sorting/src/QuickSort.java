import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        int low = 0;
        int high = arr.length-1;
        int[] result = QuickSort(arr , low , high);
        System.out.println(Arrays.toString(result));
    }
    static int[] QuickSort(int[] arr , int low , int high){
        if(low < high){
            int partitionIdx = PivotIndex(arr , low , high);
            QuickSort(arr , low , partitionIdx-1);
            QuickSort(arr , partitionIdx+1 , high);
        }
        return arr;
    }
    static int PivotIndex(int[] arr , int low , int high){
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i < j){
            while(i<=high-1 && arr[i] <= pivot ){
                i++;
            }
            while(j>=low+1 && arr[j] > pivot){
                j--;
            }
            if(i < j){
                swap(arr , i , j);
            }
        }
        swap(arr , low , j);
        return j;
    }
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
