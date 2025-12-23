package Matrix.MatrixProblemII;
import java.util.Scanner;

public class MaximumNumberOf1s {
    static void display(int[] mat){
        for(int i = 0;i<mat.length;i++){
            System.out.print(mat[i]+" ");
        }
    }
    static int findFirstOccurance(int[] arr){
        int st = 0;
        int end = arr.length-1;
        int idx = -1;
        while(st<=end){
            int mid = (end-st)/2+st;
            if(arr[mid] == 1){
                idx = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return idx;
    }
    static int[] max_ones_sorted_rows(int[][] mat){
        int maxOnes = 0;
        int row = -1;
        int m = mat[0].length;
        for(int i = 0;i<mat.length;i++){
            int idx = findFirstOccurance(mat[i]);
            if(idx != -1){
                int count = m-idx;
                if(count>maxOnes){
                    maxOnes = count;
                    row = i; 
                }
            }
        }
        return new int[] {row,maxOnes};
    }
    static int[] maximum_ones(int[][] matrix){
        int maxOnes = 0;
        int row = 0;
        for(int i = 0;i<matrix.length;i++){
            int count_1s = 0;
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 1) count_1s++;
                
            }
            if(count_1s>maxOnes){
                    maxOnes = count_1s;
                    row = i;
                }
        }
        return new int[] {row,maxOnes};
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
        display(maximum_ones(arr));
        display(max_ones_sorted_rows(arr));
        sc.close();

    }
    
}
