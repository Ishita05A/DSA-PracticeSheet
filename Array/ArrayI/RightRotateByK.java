package Array.ArrayI;

import java.util.Scanner;

public class RightRotateByK {
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    // in this we are not using extra arr to store rotated on instead returning inplace rotated arr
    static void rightRotate_inplace(int[] num,int k){
        int n = num.length;
        k = k%n;
        reverse(num, 0, n-k-1);
        reverse(num, n-k, n-1);
        reverse(num, 0, n-1);
    }
    //rotating and storing in new arr
    static int[] rightRotate(int[] num,int k){
        int n = num.length;
        k = k%n;
        int j = 0;
        int[] rotated = new int[n];
        for(int i = n-k;i<n;i++){
            rotated[j++] = num[i];
        }
        for(int i = 0;i<n-k;i++){
            rotated[j++] = num[i];
        }
        return rotated;

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
        int[] rotate = rightRotate(arr, 3);
        display(rotate);
        sc.close();
        rightRotate_inplace(arr, 3);
        System.out.println();
        display(arr);

    }
    
}
