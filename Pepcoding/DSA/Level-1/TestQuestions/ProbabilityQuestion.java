/*
Probalility Question
An urn contains 8 balls : 4 red , 2 blue and 2 green. 
Now n balls are drawn out of the urn. 
Calculate the probability that out of n drawn balls exactly x balls are red.
Input: n and x
1
*/
import java.util.Scanner;

public class ProbabilityQuestion {

    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
        {f*=i;}
        return f;
    }
  public static void main(String[] args) {
    /* Your class should be named Main.
    * Read input as specified in the question.
    * Print output as specified in the question.
    */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int f1,f2,f3,f4,f5,f6,f7;
    double ans;
    f1=fact(8-n);
    f2=fact(n);
    f3=fact(4-x);
    f4=fact(x);
    f5=fact(n-x);
    f6=fact(4-n+x);
    f7=fact(8);
   
    ans=(24*24*f1*f2)/(f3*f4*f5*f6*40320);
    double as=(24*24*f1*f2);
    double az=as/(f3*f4*f5*f6*f7);
   ans=az*100;
   int result=(int)ans;
    System.out.println(result);
    // Write your code here

  }

}