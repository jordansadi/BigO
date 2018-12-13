package edu.wctc.advjava.comparebigo;

import java.util.Scanner;

public class Main {

    private static Scanner keyboard = new Scanner(System.in);
    private static String input;

    private static long n;
    private static long c;

    public static void main(String[] args) {
        System.out.print("Enter a number under 100: ");

        input = keyboard.nextLine();
        n = Long.parseLong(input);

        System.out.print("Enter a number 2—10: ");
        input = keyboard.nextLine();
        c = Long.parseLong(input);

        System.out.printf("%9s     %9s     %9s     %9s     %9s     %22s     %22s     %20s     %22s\n",
                "O(1)","O(log log n)","O(log n)","O(n)","O(n^2)","O(n^c)", "O(2^n)","O(c^n)", "O(n!)");
        System.out.printf("%9s     %9s     %9s     %9s     %9s     %22s     %22s     %20s     %22s\n",
                "--------","--------","--------","--------","--------","----------------------", "----------------------","--------------------", "----------------------");
        for (int i=0; i<=n; i++) {

            System.out.printf("%9s     %9f     %9f     %9s     %9s     %22s     %22s     %20s     %22s\n",
                    1,
                    loglog(i),
                    log(i),
                    one(i),
                    squared(i),
                    powerConstant(i,c),
                    power(i),
                    constantPower(c,i),
                    String.valueOf(factorial(i)));
        }

        long finishm=System.nanoTime();
        //System.out.println(( (double)(finishm-reference) )/1000000000.0 + " Nano Seconds");
    }

    /*static String log(long n){
        return String.valueOf(Math.round((Math.log(n) * 1000.0)) / 1000.0);
    }*/

    static double loglog(long n){
        return Math.log(Math.log(n));
    }

    static double log(long n){
        return Math.log(n);
    }


    static double one(long n){
        return n;
    }

    static double squared(long n){
        return Math.pow(n,2);
    }

    static double powerConstant(long n, long c){
        return Math.pow(n,c);
    }

    static double power(long n){
        return Math.pow(2,n);
    }

    static double constantPower(long c, long n){
        return Math.pow(c,n);
    }

    static double factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

}
