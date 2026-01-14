public class CountNoOfSubsequences {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 1 , 1};
        System.out.println(CountSubs(arr , 0 , 0 , 2));

    }
    static int CountSubs(int[] arr , int index , int sum , int givenSum){
        if(index >= arr.length){
            if(sum == givenSum){
                return 1;
            }else{
                return 0;
            }
        }
        int l = CountSubs(arr , index+1 , sum+arr[index] , givenSum );
        int r = CountSubs(arr , index+1 , sum , givenSum);
        return l+r;
    }
}
