package String.StringII;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumOccuringCharacter {
    static Character calculate_frequency(String s){
        if(s.length()==0 || s==null) return null;
        HashMap<Character,Integer> mp = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch, 0)+1);
        }
        int maxFreq = 0;
        char ch=' ';
        for(var e:mp.entrySet()){
            if(e.getValue()>maxFreq) {
                ch = e.getKey();
                maxFreq = e.getValue();
            }
        }
       return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(calculate_frequency(str));
        sc.close();
    }
    
}
