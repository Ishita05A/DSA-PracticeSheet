package Array.ArrayI;

import java.util.Scanner;

public class ReversingAnArray {
    // To print an Array
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // this is brute-force where it is taking an extra space to reverse an array
    // TC - O(n) SC - O(n)
    static int[] reverseArray_brute(int[] arr){
        int n = arr.length;
        int[] rev = new int[n];
        int k = 0;
        for(int i = n-1;i>=0;i--){
            rev[k++] = arr[i];
        }
        return rev;
    }

    static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // optimize code where it is reversing in place
    static void reverseArray_optimized(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
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
        int[] rev = reverseArray_brute(arr);
        display(rev);
        reverseArray_optimized(arr);
        System.out.println();
        display(arr);
        sc.close();

    }
}
