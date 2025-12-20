package Array.ArrayIII;

import java.util.Scanner;

public class MaximumSubArrayProduct {
    // brute force approach
    static int maxProduct(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int product = 1;
            for(int j = i;j<arr.length;j++){
                product *= arr[j];
                max = Math.max(max, product);
            }
        }
        return max;
    }
    static int maxProduct_optimized(int[] arr){
        int preffix = 1;
        int suffix = 1;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(preffix == 0) preffix = 1;
            if(suffix == 0) suffix = 1;
            preffix*=arr[i];
            suffix*=arr[n-i-1];
            max = Math.max(max, Math.max(preffix, suffix));
        }
        return max;
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
        System.out.println(maxProduct(arr));
        sc.close();
    }
    
}
