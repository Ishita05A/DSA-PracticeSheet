package Recursion;

import java.util.Scanner;

public class PrintDecreasing {
    static void printDecreasing(int n){
        if(n == 0) return;
        
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        printDecreasing(n);
        sc.close();
    }
    
}
