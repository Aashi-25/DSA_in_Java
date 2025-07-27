public class FindMin {
    public static void main(String[] args) {
        int[] array = {18,12,-7,3,14,28};
        System.out.println(findmin(array));
    }
    static int findmin(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for (int i=1 ; i<arr.length ; i++){
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        return min;
    }
}
