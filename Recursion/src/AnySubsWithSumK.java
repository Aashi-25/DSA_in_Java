import java.util.ArrayList;
import java.util.List;

public class AnySubsWithSumK {
    public static void main(String[] args) {
        int[] arr = { 1 , 2 , 1};
        List<Integer> list = new ArrayList<>();
        System.out.println(AnySubsequence(arr , list , 0 , 0 , 2));
    }
    static boolean AnySubsequence(int[]arr , List<Integer> list , int sum , int i , int givenSum){
        if(i>= arr.length){
            if(sum == givenSum){
                System.out.println(list);
                return true;
            }
            else{
                return false;
            }
        }
        list.add(arr[i]);
        sum += arr[i];
        if(AnySubsequence(arr , list , sum , i+1 , givenSum) == true){
            return true;
        }
        list.remove(list.size()-1);
        sum -= arr[i];
        if(AnySubsequence(arr , list , sum , i+1 , givenSum) == true){
            return true;
        }
        return false;
    }
}
