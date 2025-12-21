package String.StringII;

import java.util.Scanner;

public class countNoOfWords {
    static int countWord(String str){
        if(str.length() == 0) return 0;
        int count =1;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' ') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(countWord(str));
        sc.close();
    }
    
}
