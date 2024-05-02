package Recursion;

public class countGoodNumbers {
    static int mod=(int)1e9+7;
    public static void main(String[]args){
        countGoodNumbers(4);
    }
    public static int countGoodNumbers(long n) {
        long odd = n/2; //It gives the number of odd indices starting from 1 to n.
        long even = (n+1)/2; //It gives number of even indices. It is basically n/2 + n%2;
        return (int)(pow(5, even)*pow(4, odd)%mod);
    }
    public static long pow(long x, long n){
        if(n==0) return 1;
        long temp = pow(x,n/2);
        if(n%2==0){
            return (temp*temp)%mod;
        }
        else{
            return (x*temp*temp)%mod;
        }
    }
}
