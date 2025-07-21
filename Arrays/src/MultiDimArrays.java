import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArrays {
    public static void main(String[] args) {
        // 2-D arrays
        /*
            1 2 3
            4 5 6
            7 8 9
        */
        int[][] arr = new int[3][3]; //adding number of rows is mandatory..[rows][cols]
        System.out.println(arr.length); //no of rows

        //second way
        int[][] arr2 = {
                {1 , 2 , 3}, //0th index
                {5 , 6 , 7}, // 1st index
                {9 , 0 , 3} // 2nd index
        }; //size of each individual array can vary, doesn't necessarily have the same size for each row

        //input for multi dimensional arrays
        Scanner in = new Scanner(System.in);
        for (int row=0; row<arr.length; row++){
            for (int col=0 ; col < arr[row].length ; col++){
                arr[row][col] = in.nextInt();
                System.out.print(arr[row][col] + " ");
//                System.out.println(Arrays.toString(arr[row]));
            }
            System.out.println();
        }
    }
}
