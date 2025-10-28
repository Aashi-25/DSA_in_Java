import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.println(Arrays.toString(search(arr , 5)));
    }
    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (cols == 0){
            return new int[]{-1 , -1};
        }
        if (rows == 1){
            return binarySearch(matrix , 0 , 0 , cols-1 , target);
        }
        // search in the matrix until 2 rows are remaining
        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols/2;
        while (rstart < (rend-1)){
            int mid = rstart + (rend-rstart)/2;
            if (matrix[mid][cmid] == target){
                return new int[] {mid , cmid};
            } else if(matrix[mid][cmid] > target){
                rend = mid;
            } else{
                rstart = mid;
            }
        }
        //searching in the matrix of 2 rows now
        if (matrix[rstart][cmid] == target){
            return new int[] {rstart,cmid};
        } else if(matrix[rstart + 1][cmid] == target){
            return new int[] {rstart+1 , cmid};
        }
        else if (matrix[rstart][cmid+1] <= target && target <= matrix[rstart][cols-1]) {
            return binarySearch(matrix , rstart , cmid+1 , cols-1 , target);
        }
        else if(matrix[rstart+1][cmid+1] <=target){
            return binarySearch(matrix , rstart+1 , cmid+1 , cols-1 , target);
        }
        else if(matrix[rstart][cmid-1] >= target){
            return binarySearch(matrix , rstart , 0 , cmid-1 , target);
        }
        else{
            return binarySearch(matrix , rstart+1 , 0 , cmid-1 , target);
        }
    }

    static int[] binarySearch(int[][] matrix , int row , int cstart , int cend , int target){
        while (cstart <= cend){
            int cmid = cstart + (cend - cstart)/2 ;
            if(matrix[row][cmid] == target){
                return new int[] {row , cmid};
            } else if (matrix[row][cmid] > target){
                cend = cmid - 1;
            } else{
                cstart = cmid + 1;
            }
        }
        return new int[] {-1,-1};
    }
}
