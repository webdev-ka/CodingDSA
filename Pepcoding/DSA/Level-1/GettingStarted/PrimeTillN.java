/*Print All Primes Till N
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).*/

import java.util.Scanner;
public class PrimeTillN{
    public static boolean isPrime(int n){
        boolean is_prime=true;
        for(int i=2;i*i<=n;i++)// run loop from 2 to sqrt(n)
        {
            if(n%i==0)
            {
                is_prime=false;//if number is divisible by any other number then it is not prime
                break;
            }
        }
        return is_prime;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();//check whoch number is prime between low and high range
        int high=sc.nextInt();
        
        if(low==1)
        low=low+1;//if range starts from 1 because 1 is not prime so we will increment low to next value

        for(int i=low;i<=high;i++){
        if(isPrime(i))
            System.out.println(i);
      }
        
    }

}