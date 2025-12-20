package String.StringI;

import java.util.Scanner;

public class StringIsPallindromOrNot {
    static boolean isPallindrome(String s){
        StringBuilder str = new StringBuilder("");
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) str.append(Character.toLowerCase((ch)));
        }
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(isPallindrome(str));
        sc.close();
    }
    
}
