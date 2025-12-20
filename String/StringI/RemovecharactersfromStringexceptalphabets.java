package String.StringI;

import java.util.Scanner;

public class RemovecharactersfromStringexceptalphabets {
    static String remove(String str){
        StringBuilder s = new StringBuilder("");
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch>='a' && ch <='z') || (ch>='A' && ch<='Z')) s.append(ch);
        }
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(remove(str));
        sc.close();
    }
}
