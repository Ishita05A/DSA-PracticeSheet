package Recursion;

import java.util.Scanner;

public class SumOfElementsOfArray {
    static int sumofElement(int[] arr,int idx){
        if(idx == arr.length-1) return arr[idx];
        return arr[idx]+sumofElement(arr,idx+1);
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
        System.out.println(sumofElement(arr, 0));
        sc.close();

    }
    
}
