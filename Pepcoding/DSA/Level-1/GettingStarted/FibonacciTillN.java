/*Print first n fibonacci numbers*/

import java.util.Scanner;
public class FibonacciTillN{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;//intial fib numbers are 0 and 1
        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }

}