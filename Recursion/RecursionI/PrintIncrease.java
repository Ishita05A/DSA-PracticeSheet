package Recursion.RecursionI;

import java.util.Scanner;

public class PrintIncrease {
    static void printIncreasing(int n){
        if(n == 0) return;
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        printIncreasing(n);
        sc.close();
    }
    
}
