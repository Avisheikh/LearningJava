package Recursion;

import java.util.Scanner;

/*
    Author       :- Avi-sheikh 
    Created Date :- 01/11/2022 
*/
public class RecursionExample {

    public static void main(String[] args) {

        System.out.println("Please enter non negative number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("Please enter real number");
        Scanner input2 = new Scanner(System.in);
        int x = input2.nextInt();

        System.out.println("Please enter fibonacci number: ");
        Scanner input3 = new Scanner(System.in);
        long index = input3.nextLong();

        //display factorial
//        System.out.println(String.format("The multiplication factorial number of %d is %d",n,facto(n)));
//        System.out.println(String.format("The additional factorial number of %d is %d",n,xMethod(n)));


       // xDivide(1234567);
//        System.out.println(String.format("The power number of 2 is %d",xPower(n)));
//        System.out.println(String.format("The real power number of %d is %d",x,xPower(x,n)));
//
//        System.out.println(String.format("The power number for loop of 2 is %d",xForPower(n)));
//        System.out.println(String.format("The compute positive number of %d is %d",n,computePositiveNumber(n)));
//        System.out.println(String.format("The fibonacci number for %d is %d.",index,fibo(index)));
//        nMinusOne(n);
//        nMinusOne2(n);
        wrong(n);
    }


    private static int facto(int n) {

        if (n == 0 ) {
            return 1;
        } else {
           return n * facto(n-1);
        }
    }

    private static int xMethod(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n + xMethod(n-1);
        }
    }

    private static void xDivide(int n) {
        if (n > 0) {
            System.out.println(n / 10);
            xDivide(n/10);
        }
    }

    private static int xPower(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * xPower(n-1);
        }
    }

    private static int xPower(int x,int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * xPower(x,n-1);
        }
    }

    private static int xForPower(int n) {
        int base = 2;
        int result = 0;

        for(int i = 1; i <= n; i++){
            if (i == 1 && n == 1) {
                return base;
            }
            if(i == 1) {
                result = 1;
            }
            result = base * result;
        }
        return result;
    }

    private static int computePositiveNumber(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + computePositiveNumber(n-1);
        }
    }

    private static long fibo(long index) {
        if (index == 0) {
            return 0;
        }
        else if (index == 1) {
            return 1;
        } else {
            return fibo(index - 1) + fibo(index - 2);
        }
    }

    private static void nMinusOne(int n) {
        if (n > 0) {
            System.out.println(n + " ");
            nMinusOne(n-1);
        }
    }

    private static void nMinusOne2(int n) {
        if (n > 0) {
            nMinusOne2(n-1);
            System.out.println(n + "");
        }
    }

    // What is wrong in the following methods.
    public static void wrong(double n) {
        if(n != 0) {
            System.out.println(n);
            wrong(n / 10);
        }
    }

}
