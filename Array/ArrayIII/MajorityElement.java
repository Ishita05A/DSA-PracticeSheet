package Array.ArrayIII;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    static int majorityElement_brute(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }
        int max = 0;
        int num = arr[0];
        for(var e : mp.entrySet()){
            if(e.getValue() >max) {
                max = e.getValue();
                num = e.getKey();
            }
        }
        return num;
    }
    // Moore's Algorithm
    static int majorityElement(int[] arr){
        int count = 0;
        int num = arr[0];
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(count == 0) num = arr[i];
            if(arr[i] == num) count++;
            else {
                count--;
            }
        }
        return num;
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
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement_brute(arr));
        sc.close();
    }
    
}
