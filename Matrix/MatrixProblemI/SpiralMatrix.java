package Matrix.MatrixProblemI;
import java.util.*;
import java.util.Scanner;

public class SpiralMatrix {
    static List<Integer> spiralTraversal(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int fr = 0,lr = m-1,lc=0,rc=n-1;
        int no_of_elements = 0;
        List<Integer> ans = new ArrayList<>();
        while (no_of_elements<m*n) {
            for(int i = lc;i<=rc && no_of_elements<n*m;i++){
                ans.add(arr[fr][i]);
                no_of_elements++;
            }
            fr++;
            for(int i =fr;i<=lr && no_of_elements<n*m;i++){
                ans.add(arr[i][rc]);
                no_of_elements++;
            }
            rc--;
            for(int i = rc;i>=lc && no_of_elements<n*m;i--){
                ans.add(arr[lr][i]);
                no_of_elements++;
            }
            lr--;
            for(int i = lr;i>=fr && no_of_elements<n*m;i--){
                ans.add(arr[i][lc]);
                no_of_elements++;
            }
            lc++;
        }
        return ans;
        
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
        System.out.println(spiralTraversal(arr));
        sc.close();

    }
    
}
