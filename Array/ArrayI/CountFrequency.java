package Array.ArrayI;

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
    static int maxFrequencyElement(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])) mp.put(arr[i], 1);
            else mp.put(arr[i], mp.get(arr[i])+1);
        }
        int max_freq = 0;
        for(var e: mp.entrySet()){
            if(e.getValue() > max_freq) max_freq = e.getValue();
        }
        int max_freq_sum = 0;
        for(var e: mp.entrySet()){
            if(e.getValue() == max_freq) max_freq_sum+=e.getValue();
        }
        return max_freq_sum;
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
        System.out.println(maxFrequencyElement(arr));
        sc.close();
    }
    
}
