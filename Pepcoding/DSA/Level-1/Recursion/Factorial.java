/*
Factorial prints factorial of a positive numer using recursion
n=5
prints 120
*/
import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //take input
        System.out.println(factorial(n)); //call factorial(n)
    }
    //Expectation: factorial(n): n*(n-1)..*3*2*1
    //Faith: factorial(n-1): (n-1)*(n-2)..*3*2*1
    //Expectation weds Faith: factorial(n):n*factorial(n-1)
    public static int factorial(int n){
        /*base case*/
        if(n==0)
        return 1;
        /* factorial(n) has faith that factorial(n-1) will do its work and it multiplies n with factorial(n-1) results*/
        int f=factorial(n-1);//get fact(n-1)
        int fn=n*f;
        return fn;
        /**Write Directyl in one line:
        return n*factorial(n-1); */
    }

}