package Matrix.MatrixProblemI;

import java.util.HashMap;
import java.util.Scanner;

public class PrintingElementInSortedOrder {
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] sortAnArray(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
            max = Math.max(max, arr[i]);
            min = Math.min(min,arr[i]);
        }
        int k = 0;
        for(int i = min;i<=max;i++){
            if(mp.containsKey(i)){
                while(mp.get(i)>0){
                    arr[k++] = i;
                    mp.put(i, mp.get(i)-1);
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int m = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[m];
        for(int i = 0;i<m;i++){
                arr[i] = sc.nextInt();
        }
        int[] ans = sortAnArray(arr);
        display(ans);
        sc.close();
    }
    
}
