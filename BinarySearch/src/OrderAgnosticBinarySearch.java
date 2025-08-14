// binary search in descending order
// order agnostic means we dk whether index is sorted in ascending or descending

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {40 , 34 ,25 , 12 , 9 , -3};
        int[] arr = {-18 , -12 , -4 , 0 , 2 ,3 ,4 ,15 , 16 , 22 , 45 , 89};
        int target = 45;
        System.out.println("the element is found at index number:- " +BinarySearch(arr , target));
    }

    static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isDesc = arr[start] > arr[end];
        if (isDesc) {
            while (start <= end) {
                int mid = start + ((end - start)/2);

                if (arr[mid] > target){
                    start = mid + 1;
                } else if (arr[mid] < target){
                    end = mid - 1;
                } else {
//                target = mid;
                    return mid;
                }
            }
        }
        else {
            while (start <= end) {
                int mid = start + ((end - start) / 2);

                if (target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid]){
                    start = mid +1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
        }
}
