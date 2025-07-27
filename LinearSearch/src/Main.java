public class Main {
    public static void main(String[] args) {
        int[] nums = {23 , 45 , 1 , 2 , 8 , 19 , -3 , 16 , -11 , 28};
        int target = 19;
        int ans = linearsearch(nums , target);
        System.out.println(ans);
        int ans2 = linearsearch2(nums , target);
        System.out.println(ans2);
    }

    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int index=0 ; index<arr.length ; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }

    //search the target and return the element itself
    static int linearsearch2(int[] arr , int target){
        if (arr.length == 0){
            System.out.println("Empty Array");
        }
        for(int i=0 ; i<arr.length ; i++) {
            int ele = arr[i];
            if (ele == target) {
                return ele;
            }
        }
        return -1;
    }
}