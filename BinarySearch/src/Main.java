//Algo for Binary Search -> always performed on sorted array
// 1) find the middle element
// 2) check if the target element is greater than middle element then you search in the right otherwise you search in the left
// 3) if the middle element = target element --> then i have found my ans
// 4) if start > end : element not found

// execution -> take 2 pointers -> start and end
// start = first ele , end = last ele
// mid ele index = ( start idx + end idx ) / 2

//why binary search over linear search ?

// formula =>  N/2^K = 1 .....FIND THE VALUE OF K (refer to vid again)
// k represents total number of comparisons --> in worst case , k = log n (n = size of array)

// time complexity -> O(log n)

public class Main{
    public static void main(String[] args) {
        int[] arr = {-18 , -12 , -4 , 0 , 2 ,3 ,4 ,15 , 16 , 22 , 45 , 89};
        int target = 70;
        System.out.println("INDEX = " + binarysearch(arr , target));
    }

    //return the index
    static int binarysearch (int[] arr , int target){
        // find the middle element
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                target = mid;
            }
        }
        return -1;
    }

}
