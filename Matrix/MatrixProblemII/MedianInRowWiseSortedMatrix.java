package Matrix.MatrixProblemII;
import java.util.*;
import java.util.Scanner;

public class MedianInRowWiseSortedMatrix {
    
    static int findMedian_brute(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m*n];
        int k = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[k++] = mat[i][j];
            }
        }
        Arrays.sort(arr);
        int idx = (m*n)/2;
        return arr[idx];
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
        
        System.out.println(findMedian_brute(arr));
        sc.close();
    }
    
}
