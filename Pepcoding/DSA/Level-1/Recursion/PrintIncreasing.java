/**
Print Increasing: Print 1 to n(counting in increasing order)
1. You are given a positive number n. 
2. You are required to print the counting from 1 to n.
3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.
Eg: 
PD(5) prints 1 2 3 4 5
Input: 5
Output:
1
2
3
4
5
 */

import java.io.*;
import java.util.*;

public class PrintIncreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //take input
        printIncreasing(n); //call printIncreasing(n)
    }

    //Expectation: PD(n)- 1 2 3... n-1 n
    //Faith: PD(n-1): 1 2 3 ....n-2 n-1
    //Expectation weds Faith: PD(n)=PD(n-1)*n
 
    public static void printIncreasing(int n){
        /*base case*/
        if(n==0)
        return;
        /*Print Pi(n) prints n and has faith that pi(n-1) will print from 1 to n-1*/
        printIncreasing(n-1);
        System.out.println(n);
    }

} 