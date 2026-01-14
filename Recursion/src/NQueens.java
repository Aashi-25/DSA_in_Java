import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        //initialise each element in board with a "."
        for(int i=0 ; i<n ; i++){
            Arrays.fill(board[i] , '.');
        }
        //create arrays for leftRow , upperDiag , LowerDiag
        int[] leftRow = new int[n];
        int[] upperDiag = new int[2*n - 1];
        int[] lowerDiag = new int[2*n-1];

        solve(ans , board , 0 , n , leftRow , upperDiag , lowerDiag);
        return ans;
    }
    //recursive function
    static void solve(List<List<String>> ans , char[][] board , int col , int n , int[]leftRow , int[]upperDiag , int[]lowerDiag){
        //base condition
        if(col == n){
            List<String> temp = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for(int row=0 ; row<n ; row++){
            if(
                    leftRow[row] == 0 && lowerDiag[row+col] == 0 && upperDiag[n-1 + col-row] == 0
            ){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiag[row+col] = 1;
                upperDiag[n-1 + col-row] = 1;

                solve(ans , board , col+1 , n , leftRow , upperDiag , lowerDiag);

                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiag[row+col] = 0;
                upperDiag[n-1 + col-row] = 0;

            }
        }

    }
    public static void main(String[] args) {
        System.out.println(solveNQueens(8));
    }

}