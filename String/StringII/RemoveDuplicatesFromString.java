package String.StringII;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromString {
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
        System.out.println(removeDuplicates(str));
        sc.close();
    }
    
}
