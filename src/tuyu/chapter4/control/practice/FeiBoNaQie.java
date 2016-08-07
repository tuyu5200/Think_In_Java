package tuyu.chapter4.control.practice;

import java.util.Scanner;

import static net.mindview.util.Print.*;

/**
 * Program is use
 * Version: 2016/7/28
 * Author: Tuyu
 */
public class FeiBoNaQie {
    int fib(int n) {
        if (n < 2) return 1;
        return (fib(n - 2) + fib(n - 1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("enter the size of the Fibonacci:");
        int  k=in.nextInt();
        FeiBoNaQie f=new FeiBoNaQie();
        //int k = Integer.parseInt(args[0]);
        print( k + "  Feibonaqie Numbers(s): ");
        for (int i = 0; i < k; i++) {
            printnb(f.fib(i)+" ");

        }
    }
}
