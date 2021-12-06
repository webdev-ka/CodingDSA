/* Display Hourglass Pattern
if no of row=5
11111
 111
  1
 111
11111
*/

import java.util.Scanner;
class Hourglass
{public static void main(String args[])throws Exception
{Scanner sc=new Scanner(System.in);
int i,j,k,m,p,r;
System.out.println("Row");
r=sc.nextInt();
p=(r/2)-1;
for(i=1;i<=r;i+=2)
{
for(j=1;j<i;j+=2)
System.out.print(" ");
for(k=i;k<=r;k++)
System.out.print(1);
System.out.println();}

for(i=1,m=r-2;i<=r-1;i+=2,m-=2,p--)
{
for(j=1;j<=p;j++)
System.out.print(" ");
for(k=m;k<=r;k++)
System.out.print(1);
System.out.println();}}}

