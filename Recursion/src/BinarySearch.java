public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1 , 3 ,5 ,7 ,9 , 78 , 80};
        int target = 78;
        System.out.println(BS(0 , arr.length-1 , target , arr));
    }
    static int BS(int start , int end , int target , int[] arr){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(target > arr[mid]){
            return BS(mid+1 , end , target , arr);
        } else if (target < arr[mid]) {
            return BS(start ,mid-1 , target , arr );
        }else{
            return mid;
        }
    }
}
