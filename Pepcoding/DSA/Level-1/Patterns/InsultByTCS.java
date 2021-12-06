/*Can't Forget how i was insulted in TCS that was a nightmare
dont know what happened to me that day i lost my senses
and became someone i am not 
interviewer gave me the following pattern
   *
  * *
 * * *
* * * *
i got confused and didn't recognize spacing.
but here I'm doing this in 5mins*/

import java.util.Scanner;
class InsultByTCS
{public static void main(String args[]){
int i,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of rows");
int n=sc.nextInt();
for(i=1;i<=n;i++)
{for(k=n-i;k>=1;k--){
System.out.print(" ");
}
for(j=1;j<=(i*2-1);j++)
{
if(j%2==0)
System.out.print(" ");
else
System.out.print("*");
}
System.out.println();
}
}}

