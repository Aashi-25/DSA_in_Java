import java.util.ArrayList;
import java.util.List;

public class AllSubsequences {
    public static void main(String[] args) {
        int[] arr = {3 , 1 , 2};
        List<Integer> Newarr = new ArrayList<>();
        printSubs(0 , Newarr , arr);
    }
    static void printSubs(int index , List<Integer> Newarr , int[]arr){
        //writing base condition to stop recursion
        if(index >= arr.length){
            System.out.println(Newarr);
            return;
        }
        Newarr.add(arr[index]);
        printSubs(index+1 , Newarr , arr);

        Newarr.remove(Newarr.size()-1);
        printSubs(index+1 , Newarr , arr);
    }
}
