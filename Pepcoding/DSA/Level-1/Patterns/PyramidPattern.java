/*for n=5 prints
    *
   ***
  *****
 *******
*********
*/
import java.util.*;
public class PyramidPattern
{
public static void main(String[] args)
{
int n, i, j, k = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter n");
n = sc.nextInt();
for(i = 1; i <= n; i++)
{k=0;
for(j = 1; j <= n - i;j++)
{
System.out.print(" ");
}


while(k != 2 * i-1)
{
System.out.print("*");
++k;
}

System.out.print("\n");
}
}
}
