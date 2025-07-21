import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 23;
        arr[2] = 23;
        arr[3] = 23;
        arr[4] = 23;
        System.out.println(arr[3]);

        // input using for loops
        for (int i=0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
            int num = arr[i];
            System.out.print(num + " ");

            System.out.println(Arrays.toString(arr));
        }
        // using enhanced for loop to print the array
        for (int num : arr){
            System.out.print(num + " ");
        }

        //array of objects
        String[] str = new String[4];
        for (int i = 0 ; i<str.length ; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1] = "heyy";
        System.out.println(str);
    }
}
