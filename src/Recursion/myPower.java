package Recursion;

import static java.lang.StrictMath.pow;

public class myPower {
    public static void main(String[]args){
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x,n));

    }
    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n == Integer.MIN_VALUE){
            x = x*x;
            n = n/2;
        }
        if(n<0){
            x = 1/x;
            n = -n;
        }
        return (n%2==0)? myPow(x*x,n/2):x*myPow(x*x,n/2);
    }
}
