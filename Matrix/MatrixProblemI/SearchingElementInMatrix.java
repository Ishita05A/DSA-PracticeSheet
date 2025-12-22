package Matrix.MatrixProblemI;

import java.util.Scanner;

public class SearchingElementInMatrix {
    static boolean isElementPresent(int[][] arr,int target){
        int n = arr.length;
        int m = arr[0].length;
        int row = 0;
        for(int i = 0;i<n;i++){
            if(arr[i][m-1] == target) return true;
            if(arr[i][m-1] > target){
                row = i;
                break;
            }
        }
        for(int i = 0;i<m;i++){
            if(arr[row][i] == target) return true;
        }
        return false;
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
        System.out.println(isElementPresent(arr, 8));
        sc.close();
    }
    
}
