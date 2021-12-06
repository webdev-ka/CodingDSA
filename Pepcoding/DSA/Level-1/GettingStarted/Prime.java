import java.util.Scanner;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//check if n is prime or not
        boolean isPrime=true;
        for(int i=2;i*i<=n;i++)// run loop from 2 to sqrt(n)
        {
            if(n%i==0)
            {
                isPrime=false;//if number is divisible by any other number then it is not prime
                break;
            }
        }
        if(isPrime)
            System.out.println(n+" is prime");
        else 
            System.out.println(n+" is not prime");
    }

}