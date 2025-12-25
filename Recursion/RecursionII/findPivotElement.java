package Recursion.RecursionII;

import java.util.Scanner;

public class findPivotElement {
    static int helper(int[] arr,int idx,int rightSum,int leftSum){
        
        if(idx == arr.length) return -1;
        int curr = arr[idx];
        rightSum-=curr;
        if(rightSum == leftSum) return idx;
        return helper(arr, idx+1, rightSum, leftSum+curr);
    }
    static int totalSum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static int find_pivot_idx(int[] arr){
        int rightSum = totalSum(arr);
        return helper(arr, 0, rightSum , 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(find_pivot_idx(arr));
        sc.close();

        
    }
    
}
