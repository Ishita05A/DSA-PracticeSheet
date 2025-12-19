package Array.ArrayII;
import java.util.*;

public class FindRepeatingElement {
    static List<Integer> repeatingElement(int[] arr){
        HashSet<Integer> mp = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(mp.contains(arr[i]) && !ans.contains(arr[i])){
                ans.add(arr[i]);
            }
            else  mp.add(arr[i]);
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
        List<Integer> ans = repeatingElement(arr);
        System.out.println(ans);
        sc.close();
    
    }
    
}
