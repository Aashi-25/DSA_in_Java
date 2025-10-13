public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 5;
        System.out.println(ans(arr , target));
    }
    //function to calculate the range for finding element as infinite array given -> steps to find start and end
    static int ans(int[] arr , int target) {
        // take block size of 2 first
        int start = 0;
        int end = 1;
        // defining condition for updating range incase element not found in decided range
        while (target > arr[end]) {
            int temp = end + 1 ;
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return binarysearch(arr , target , start , end);
    }

    static int binarysearch(int[] arr , int target , int start , int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
