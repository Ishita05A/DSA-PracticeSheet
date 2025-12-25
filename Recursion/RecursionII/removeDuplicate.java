package Recursion.RecursionII;

import java.util.Scanner;

public class removeDuplicate {
    static int remove_Duplicate(int[] arr,int k, int i){
        if(i == arr.length) return k;
        if(arr[i] != arr[i-1]) {
            arr[k] = arr[i];
            return remove_Duplicate(arr, k+1, i+1);
        }
        return remove_Duplicate(arr, k, i+1);
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
        System.out.println(remove_Duplicate(arr, 1 , 1));
        sc.close();
    }
    
}
