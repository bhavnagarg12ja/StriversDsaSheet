package Recursion;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args){
//        printName(1,3);
//        print1ton(1,3);
//        printnto1(5);
//        backTracking(4);
//        backTrackingnto1(1,4);
//        sum(4,0);
//        System.out.println(functionalSum(3));
//        System.out.println(factorial(4));
          System.out.println(fibonacci(7));

//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println("Original array: " + Arrays.toString(array));
//        reverseArray(array);
//        System.out.println("Reversed array: " + Arrays.toString(array));
//        int[] array2 = {12, 2, 3, 4, 5};
//        System.out.println("Original array: " + Arrays.toString(array2));
//        reverseArray1(array2, 0, array2.length);
//        System.out.println("Reversed array: " + Arrays.toString(array2));
//
//        String str = "abcdecba";
//        Boolean result = isPalindrome(str,0);
//        System.out.println(result);
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
    //parameterized way
    public static void sum(int i, int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
        sum(i-1, sum+i);
    }
    //functional way
    public static int functionalSum(int n){
        if(n == 0){
            return 0;
        }
        return n + functionalSum(n-1);
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    //reverseing an array
    public static void reverseArray(int[] arr){
        swap(arr,0,arr.length-1);
    }

    private static void swap(int[]arr, int left, int right) {
        if(left>=right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        swap(arr, left+1,right-1);
    }

    public static void reverseArray1(int[] arr, int i, int n){
        if(i>n/2){
            return;
        }
        swapArray(arr, i, n-i-1);
        reverseArray1(arr, i+1, n);
    }

    private static void swapArray(int[]arr, int left, int right) {
        if(left>=right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    //check string is palindrome or not
    public static Boolean isPalindrome(String str, int i){
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        return isPalindrome(str, i+1);
    }
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
