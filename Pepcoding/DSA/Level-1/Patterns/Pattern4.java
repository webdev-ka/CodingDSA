/*
For n=5, prints:
*       *       *       *       *
        *       *       *       *
                *       *       *
                        *       *
                                *

2codes use whichever you like
*/
import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("*\t");
            }
             System.out.println();
        }

    }
}
/*Approach2 Code
import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("\t");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("*\t");
            }
             System.out.println();
        }

    }
}
*/