package Array.ArrayII;
import java.util.*;

public class FindRepeatingElement {
    static List<Integer> repeatingElement_optimized(int[] arr){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            int idx =Math.abs(arr[i])-1;
            if(arr[idx]>0){
                arr[idx] = -arr[idx];
            }
            else{
                ans.add(Math.abs(arr[idx]));
            }
        }
        return ans;
    }
    static List<Integer> repeatingElement(int[] arr){
       HashMap<Integer,Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }
        for(var e : mp.entrySet()){
            if(e.getValue()>1) ans.add(e.getKey());
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
        List<Integer> ans = repeatingElement_optimized(arr);
        System.out.println(ans);
        sc.close();
    
    }
    
}
