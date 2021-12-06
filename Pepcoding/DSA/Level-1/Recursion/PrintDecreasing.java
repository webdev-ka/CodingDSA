/**
Print Decreasing: Print n to 1(counting in decreasing order)
1. You are given a positive number n. 
2. You are required to print the counting from n to 1.
3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.
Eg: 
PD(5) prints 5 4 3 2 1
Input: 5
Output:
5
4
3
2
1
 */

import java.io.*;
import java.util.*;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //take input
        printDecreasing(n); //call printDecreasing(n)
    }

    //Expectation: PD(n)- n n-1 ... 5 4 3 2 1
    //Faith: PD(n-1): n-1 n-2 .... 4 3 2 1
    //Expectation weds Faith: PD(n)=n*PD(n-1)
    public static void printDecreasing(int n){
        /*base case*/
        if(n==0)
        return;
        /*Print Pd(n) prints n and has faith that pd(n-1) will print from n-1 to 1*/
        System.out.println(n);
        printDecreasing(n-1);
    }

} 