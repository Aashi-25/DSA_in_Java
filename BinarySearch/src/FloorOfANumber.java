//floor of a num refers to the greatest element smaller or equal to target

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 8;
        System.out.println(findFloor(arr , target));
    }
    static int findFloor(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
    return start;
    }
}
