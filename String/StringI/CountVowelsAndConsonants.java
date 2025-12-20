package String.StringI;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    static void count_vowels_and_consonants(String str){
        String s = "aeiouAEIOU";
        int vowel = 0;
        int consonant = 0;
        int whiteSpace = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' ') whiteSpace++;
            else if(s.contains(ch+"")) vowel++; 
            else consonant++;
        }
        System.out.println("Vowel :"+vowel);
        System.out.println("Consonant :"+consonant);
        System.out.println("White space :"+whiteSpace);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        count_vowels_and_consonants(str);
        sc.close();
    }
    
}
