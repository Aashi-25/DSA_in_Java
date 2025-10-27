import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10 , 20, 30, 40},
                      {15 , 25, 35, 45},
                       {28, 29, 37, 49},
                       {33 , 34 , 38 , 50}};
        System.out.println (Arrays.toString((Search(arr,37))));
    }

    //using int[] datatype as we wish to return two values(index of row and col) but by default , java allows to return only one value, hence, we wrap it inside an array
    static int[] Search(int[][] matrix , int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0) {
            if (target == matrix[r][c]) {
                return new int[]{r,c};
            } else if (target < matrix[r][c]) {
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
