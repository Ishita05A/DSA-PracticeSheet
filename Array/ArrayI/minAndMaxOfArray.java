package Array.ArrayI;

import java.util.Scanner;

public class minAndMaxOfArray {
    static int findMinimum_index(int[] arr){
        int min = Integer.MAX_VALUE;
        int min_idx = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                min_idx = i;
            }
        } 
            
        return min_idx;
    }
    static int findMaximum_index(int[] arr){
        int max = Integer.MIN_VALUE;
        int max_idx = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                max_idx = i;
            }
        }
        return max_idx;
    }
    static int minimumDeletion(int[] arr){
        int min_idx = findMinimum_index(arr);
        int max_idx = findMaximum_index(arr);
        int ans = 0;
        int n = arr.length;
        if(min_idx<n/2) ans+=min_idx+1;
        else ans+=n-min_idx;
        if(max_idx<n/2) ans+=max_idx+1;
        else ans+=n-max_idx;
        return ans;
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
        System.out.println(minimumDeletion(arr));
        sc.close();
        
    }
    
}
