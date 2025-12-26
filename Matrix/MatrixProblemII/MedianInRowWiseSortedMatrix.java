package Matrix.MatrixProblemII;
import java.util.*;
import java.util.Scanner;

public class MedianInRowWiseSortedMatrix {
    
    static int upperBound(int[] arr,int target){
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = (end-st)/2+st;
            if(arr[mid] <= target) st = mid+1;
            else end = mid -1;
        }
        return st;
    }
    static int blackBox(int[][] mat, int x){
        int count = 0;
        for(int i = 0;i<mat.length;i++){
            count+=upperBound(mat[i], x);
        }
        return count;
    }
    static int find_meadian_optimized(int[][] mat){
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0;i<mat.length;i++){
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][m-1]);
        }
        int req = (m*n)/2;
        while(low<=high){
            int mid = (low+high)/2;
            int smallerEquals = blackBox(mat, mid);
            if(smallerEquals<=req) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
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
        System.out.println(find_meadian_optimized(arr));
        sc.close();
    }
    
}
