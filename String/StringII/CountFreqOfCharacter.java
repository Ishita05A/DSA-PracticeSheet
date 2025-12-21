package String.StringII;

import java.util.Scanner;
import java.util.TreeMap;

public class CountFreqOfCharacter {
    static String countFreq(String str){
        TreeMap<Character,Integer> mp = new TreeMap<>();
        StringBuilder s = new StringBuilder("");
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }
        for(var e: mp.entrySet()){
            s.append(e.getKey());
            s.append(e.getValue());
            s.append(" ");
        }
        return s.substring(0,s.length()-1).toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(countFreq(str));
        sc.close();
    }
    
}
