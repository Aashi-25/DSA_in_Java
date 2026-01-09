import java.util.ArrayList;
import java.util.List;

public class AllSubsWithSumK {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 1};
        List<Integer> list = new ArrayList<>();
        printSubsequences(arr , list , 0 , 0 , 2);
    }
    static void printSubsequences(int[]arr , List<Integer> list, int sum , int index , int givenSum){
        if(index >= arr.length){
            if(sum == givenSum){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[index]);
        sum += arr[index];
        printSubsequences(arr , list , sum , index+1 , givenSum);
        list.remove(list.size()-1);
        sum -= arr[index];
        printSubsequences(arr , list , sum , index+1 , givenSum);
    }
}
