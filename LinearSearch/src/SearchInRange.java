public class SearchInRange {
    public static void main(String[] args) {
        // arr = [18,12,-7,3,14,28]
        // search for 3 in the range of index[1,4]
        int[] array = {18,12,-7,3,14,28};
        int target = 14;
        System.out.println(search(array , target));
    }
    static int search (int[] arr , int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i=1; i<=4 ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
