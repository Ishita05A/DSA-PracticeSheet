package Array.ArrayII.Searching;

import java.util.Scanner;

public class LinearSearch {
    static void linearSearch(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.printf("Element founnd at %d",i);
                return;
            }
        }
        System.out.println("Element not found");
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
        linearSearch(arr, 3);
        sc.close();
    }
    
}
