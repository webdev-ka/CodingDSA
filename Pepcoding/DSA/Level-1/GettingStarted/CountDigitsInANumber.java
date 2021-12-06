/*Print count of digits in a number n*/

import java.util.Scanner;
public class CountDigitsInANumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        while(n>0)
        {   ++d;//count no of digits
            n=n/10;//reduce number
        }
        System.out.println(d);
    }

}