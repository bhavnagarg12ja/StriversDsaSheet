package Recursion;

public class Practice {
    public static void main(String[] args){
//        printName(1,3);
//        print1ton(1,3);
//        printnto1(5);
//        backTracking(4);
        backTrackingnto1(1,4);
    }
    public static void printName(int i,int n){
        if(i > n){
            return;
        }
        System.out.println("Bhavna");
        printName(i+1,n);
    }
    public static void print1ton(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print1ton(i+1,n);
    }
    public static void printnto1(int i){
        if(i<1){
            return;
        }
        System.out.println(i);
        printnto1(i-1);
    }
    public static void backTracking(int i){
        if(i<1){
            return;
        }
        backTracking(i-1);
        System.out.println(i);
    }
    public static void backTrackingnto1(int i,int n){
        if(i>n){
            return;
        }
        backTrackingnto1(i+1,n);
        System.out.println(i);
    }

}
