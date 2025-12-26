package Array.ArrayI;

import java.util.Scanner;

public class RemoveMinAndMaxFromArray {
    static int min_no_of_deletion(int[] arr){
        int min_idx = 0; 
        int max_idx = 0;
        int n = arr.length;
        for(int k = 0;k<n;++k){
            if(arr[k]<arr[min_idx]) min_idx = k;
            if(arr[k]>arr[max_idx]) max_idx = k;
        }
        int from_front = Math.max(min_idx+1, max_idx+1);
        int from_back = Math.max(n-max_idx, n-min_idx);
        int from_both_side = Math.min(min_idx+1 +n-max_idx,max_idx+1+n-min_idx);
        return Math.min(Math.min(from_back, from_front), from_both_side);

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Elements");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(min_no_of_deletion(arr));
        sc.close();
    }
    
}
