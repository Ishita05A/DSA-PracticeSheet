package Array.ArrayI;

import java.util.Scanner;

public class RunningSum {
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // prevsum stores the sum of previous elements and at each iteration we are adding the 
    // current element to previous sum and storing in new array
    static int[] runningSum(int[] arr){
        int n = arr.length;
        int[] running_sum = new int[n];
        int prevsum = 0;
        for(int i = 0;i<running_sum.length;i++){
            running_sum[i] = prevsum+arr[i];
            prevsum+=arr[i];
        }
        return running_sum;
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
        int[] running_sum = runningSum(arr);
        display(running_sum);
        sc.close();
    }
    
}
