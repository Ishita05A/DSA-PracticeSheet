package Array.ArrayIII;
import java.util.*;
import java.util.Scanner;

public class unionOf2Array {
    static ArrayList<Integer> findUnion(int[] arr1,int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        TreeSet<Integer> mp = new TreeSet<>();
        for(int i = 0;i<arr1.length;i++){
            mp.add(arr1[i]);
        }
        for(int i = 0;i<arr2.length;i++){
            mp.add(arr2[i]);
        }
        for(int num:mp){
            ans.add(num);
        }
        return ans;
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
         System.out.println("Enter no. of Elements of 2nd array");
        int m = sc.nextInt();
        System.out.println("Enter Elements");
        int[] arr1 = new int[n];
        for(int i = 0;i<m;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println(findUnion(arr1, arr));
        sc.close();
    }
    
}
