/*
for n=5

  *         *
 ***       ***
*****@@@@@*****
     @@@@@
     @@@@@
     @@@@@
     @@@@@
     *****
      ***
       *

*/

import java.util.Scanner;
class Webkul_Pattern
{public static void main(String args[])
{int i,j,k,m,l,y;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1,m=1,y=(n*2)-1;i<=n;i+=2,m+=1,y-=2)
{
for(k=n/2;k>=m;k--)
{System.out.print(" ");}
for(j=1;j<=i;j++){
System.out.print("*");}
if(i==n)
{for(l=1;l<=n;l++){System.out.print("@");}}
else{for(k=y;k>=1;k--)
{System.out.print(" ");}}
for(j=1;j<=i;j++){
System.out.print("*");}
System.out.println();
}
for(i=1;i<=n-1;i++)
{for(l=1;l<=n;l++)
{System.out.print(" ");}for(j=1;j<=n;j++){System.out.print("@");}
System.out.println();}
for(i=n,m=n/2;i>=1;i-=2,m--)
{for(l=1;l<=n;l++)
{System.out.print(" ");}
for(k=m;k<n/2;k++)
{System.out.print(" ");}
for(j=1;j<=i;j++)
{System.out.print("*");}
System.out.println();}


