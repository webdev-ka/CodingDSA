/*1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
Print Digits of a number left to right order:
Example:
Input: 9843
Output:
Digits are:
9
8
4
3
*/

import java.util.Scanner;
public class PrintDigitsLefttoRight{

    //Calculate count of digits of number
    public static int countDigits(int n){
        int d=0;
        while(n>0)
        {   ++d;//count no of digits
            n=n/10;//reduce number
        }
        return d;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //finding divisor(power)
        int power=(int)Math.pow(10,(countDigits(n)-1));
        while(power>=1){//power till it is 1 run the loop
            System.out.println(n/power);//print the quotient
            n=n%power;//reduce number
            power=power/10;//reducing divisor by 10 as number size is reduced
        }    
    }
}
