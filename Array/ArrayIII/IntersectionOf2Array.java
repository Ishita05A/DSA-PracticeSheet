package Array.ArrayIII;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOf2Array {
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    static int[] intersectionOf2Array(int[] arr1,int[] arr2){
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> mp = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            mp.add(arr1[i]);
        }
        for(int i = 0;i<arr2.length;i++){
           if(mp.contains(arr2[i])) {
            ans.add(arr2[i]);
            mp.remove(arr2[i]);
           }
        }
        int[] res = new int[ans.size()];
        for(int i = 0;i<res.length;i++){
            res[i] = ans.get(i);
        }
        return res;
        
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
        int[] ans = intersectionOf2Array(arr1, arr);
        display(ans);
        sc.close();

    }
    
}
