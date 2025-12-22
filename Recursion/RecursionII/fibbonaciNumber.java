package Recursion.RecursionII;

import java.util.Scanner;

public class fibbonaciNumber {
    static int findNthFibbonaci(int n){
        if(n == 0|| n==1) return n;
        return findNthFibbonaci(n-1)+findNthFibbonaci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(findNthFibbonaci(n));
        sc.close();
    }
    
}
