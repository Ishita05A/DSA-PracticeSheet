package Array.ArrayII.Searching;

import java.util.Scanner;

public class BinarySearch {
    static int find_element_binary_search(int[] arr,int target){
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = (end -st)/2+st;
            if(arr[mid] == target) return mid;
            else if(arr[mid]>target){
                end = mid-1;
            }
            else st = mid+1;
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
        System.out.printf("Element found at an index %d",find_element_binary_search(arr, 3));
        sc.close();
    }
    
}
