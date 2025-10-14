public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 , 50, 3 , 2};
        System.out.println("Peak element is found at index " + (binarysearch(arr)));
    }
    static int binarysearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end-start)/2 ;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid +1] > arr[mid]){
                start = mid + 1;
            }
        }
        return start;
    }
}
