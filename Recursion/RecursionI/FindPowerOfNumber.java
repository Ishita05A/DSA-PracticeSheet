package Recursion.RecursionI;

import java.util.Scanner;

public class FindPowerOfNumber {
    static int findPowerRaiseToReverse(int n){
        int num = n;
        int rev = 0;
        while(num>0){
            rev = rev*10+num%10;
            num/=10;
        }
        return (int)Math.pow(n, rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(findPowerRaiseToReverse(n));
        sc.close();
    }
    
}
