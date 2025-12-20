package Array.ArrayII;

import java.util.Scanner;

public class FindEquilibriumElement {
    static int totalSum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static int equilibrium_element_idx(int[] arr){
        int leftSum = 0;
        int rightSum = totalSum(arr);
        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
            rightSum -=curr;
            if(leftSum == rightSum) return i;
            leftSum+=curr;
        }
        return -1;
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
        System.out.println(equilibrium_element_idx(arr));
        sc.close();
    }
    
}
