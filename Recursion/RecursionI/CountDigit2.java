package Recursion.RecursionI;

import java.util.Scanner;

public class CountDigit2 {
    static int evenlyDivides(int n){
        int num = n;
        int count = 0;
        while(num>0){
            int d = num%10;
            
            if(d != 0 && n%d == 0) count++;
            num/=10;
        }
        return count;
    }
    static int helper(int num,int original){
        if(num == 0) return 0;
        int d = num % 10;
        int count = 0;
        if(d != 0 && original%d == 0) count++;
        return count + helper(num/10, original);
    }
    static int evenlyDivides_recursive(int n){
        return helper(n, n);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(evenlyDivides(n));
        System.out.println(evenlyDivides_recursive(n));
        sc.close();
    }
    
}
