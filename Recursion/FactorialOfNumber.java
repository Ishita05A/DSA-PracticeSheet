package Recursion;

import java.util.Scanner;

public class FactorialOfNumber {
    static int findFactorial(int n){
        if(n == 0 || n == 1) return 1;
        return n*findFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(findFactorial(n));
        sc.close();
    }
    
}
