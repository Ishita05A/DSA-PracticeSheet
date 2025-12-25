package String.StringII;
import java.util.*;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromString {
    // remove duplicate and store result in smallest lexicographical order
    static String removeDuplicateoptimized(String str){
        StringBuilder ans = new StringBuilder();
        int[] lastIdx = new int[26];
        boolean[] duplicate = new boolean[26];
        Stack<Character> st = new Stack<>();
        Arrays.fill(duplicate,false);
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            lastIdx[ch-'a'] = i;
        }
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            int idx = ch-'a';
            if(duplicate[idx]) continue;
            while(!st.isEmpty() && st.peek()>ch && lastIdx[st.peek()-'a']>i){
                duplicate[st.peek()-'a'] = false;
                st.pop();

            }
            st.push(ch);
            duplicate[idx] = true;
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();

    }
    static String removeDuplicates(String str){
        StringBuilder s = new StringBuilder("");
        HashSet<Character> mp = new HashSet<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!mp.contains(ch)){
                s.append(ch);
                mp.add(ch);
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        // System.out.println(removeDuplicates(str));
        System.out.println(removeDuplicateoptimized(str));
        sc.close();
    }
    
}
