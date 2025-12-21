package Recursion;

import java.util.Scanner;

public class CountDigit2 {
    static int evenlyDivides(int n){
        int num = n;
        int count = 0;
        while(num>0){
            if(n%(num%10) == 0) count++;
            num/=10;
        }
        return count;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(evenlyDivides(n));
        sc.close();
    }
    
}
