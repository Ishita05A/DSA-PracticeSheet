package Array.ArraySorting;

import java.util.Scanner;

public class InsertionSort {
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int j = i+1;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
                j--;

            }
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
        insertionSort(arr);
        display(arr);
        sc.close();
    }
    
}
