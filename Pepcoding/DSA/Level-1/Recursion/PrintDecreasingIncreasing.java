/*
1. You are given a positive number n. 
2. You are required to print the counting from n to 1 and back to n again.
3. You are required to not use any loops. Complete the body of pdi function to achieve it. Don't change the signature of the function.
Eg: 
PDI(5) prints 5 4 3 2 1 1 2 3 4 5
Input: 5
Output:
5
4
3
2
1
1
2
3
4
5
*/
import java.io.*;
import java.util.*;

public class PrintDecreasingIncreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //take input
        pdi(n); //call printDecreasingIncreasing(n)
    }
    //Expectation: PDI(n)- n n-1 ... 5 4 3 2 1 1 2 3 4 5...n-1 n
    //Faith: PDI(n-1): n-1 n-2 .... 4 3 2 1 1 2 3 4 ... n-2 n-1
    //Expectation weds Faith: PDI(n)=n*PDI(n-1)*n
    public static void pdi(int n){
        /*base case*/
        if(n==0)
        return;
        /*Print Pdi(n) prints n and has faith that pd(n-1) will print from n-1 to 1 and 1 to n-1 and then pdi(n) will print n*/
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

}