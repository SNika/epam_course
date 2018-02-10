package task_5;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        System.out.print("Enter a matrix size: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] matrix = new int[n][n];

            for (int i = 0; i < matrix.length; i++){
                for (int j = 0, m=n-1; j < matrix.length; j++, m--){
                    matrix[i][i]=1;
                    matrix[j][m]=1;
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
}


