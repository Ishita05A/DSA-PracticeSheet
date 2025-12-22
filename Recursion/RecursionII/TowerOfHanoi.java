package Recursion.RecursionII;

import java.util.Scanner;

public class TowerOfHanoi {
    static void tower_of_hanoi(int n,String src,String hlpr,String dest){
        if(n == 1){
            
            System.out.println("Transfer "+n+" from "+src+ " to " +dest);
            return;
        }
        tower_of_hanoi(n-1, src, dest, hlpr);
        System.out.println("Transfer "+n+" from "+src+ " to " +dest);
        tower_of_hanoi(n-1, hlpr, src, dest);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        tower_of_hanoi(n, "S", "H", "D");
        sc.close();
    }
    
}
