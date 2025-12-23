package Matrix.MatrixProblemII;

import java.util.Scanner;

public class RotateMatrixBy90deg {
    static void display(int[][] mat){
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void transpose_of_matrix(int[][] matrix){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateMatrixBy90deg(int[][] matrix){
        transpose_of_matrix(matrix);
        for(int i = 0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int m = sc.nextInt();
         System.out.println("Enter no. of columns");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[][] arr = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        rotateMatrixBy90deg(arr);
        display(arr);
        sc.close();

    }
    
}
