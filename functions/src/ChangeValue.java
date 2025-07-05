import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
         // create an array
        int[] arr = {1,3,4,7,6};
        change(arr);
        System.out.println(Arrays.toString(arr)); //toString takes an integer array and return the string value of it
    }

    static void change(int[] nums){
        nums[0] = 99; //if you make a change to the object via this reference var , same object will be changed
    }
}
//in java , we do not have pointers
