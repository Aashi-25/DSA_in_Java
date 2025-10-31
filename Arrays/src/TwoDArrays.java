import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner Sc = new Scanner(System.in);
        for (int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                matrix[i][j] = Sc.nextInt();
            }
        }

        for (int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(findLargest(matrix));
    }

    static int findLargest(int[][] matrix){
        int largest = matrix[0][0];
        for (int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }
}
