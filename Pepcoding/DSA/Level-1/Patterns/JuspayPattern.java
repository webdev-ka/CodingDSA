/*
for n=7
*######
**#####
***####
****###
*****##
******#
*******
*/

import java.util.Scanner;
class JuspayPattern
{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
int N=sc.nextInt();char i,j,k,m;
int pos=65+(N-1);
int p=65+(N-2);
for(i='A';i<=(char)pos;i++)
{for(k='A';k<i;k++)
{System.out.print(" ");
}
for(j=i;j<=(char)pos;j++)
{System.out.print(j);}
for(m=(char)p;m>=i;m--)
{System.out.print(m);
}
System.out.println();}}
}*/

import java.util.Scanner;
class JuspayPattern
{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
int N=sc.nextInt();int i,j,m;

for(i=1;i<=N;i++)
{
for(j=1;j<=i;j++)
{System.out.print("*");}
for(m=N-1;m>=i;m--)
{System.out.print("#");
}
System.out.println();}}
}

