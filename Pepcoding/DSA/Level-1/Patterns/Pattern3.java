/*
For n=5, prints:
                                *
                        *       *
                *       *       *
        *       *       *       *
*       *       *       *       *

Sir's Approach(Refer Notes)
**/
import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
         int n=scn.nextInt();//no of rows

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("\t");//prints spacing
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
             System.out.println();
        }
    }
}
/** My Approach

import java.util.*;

public class Pattern3MyCode {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
         int n=scn.nextInt();//no of rows

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("\t");//prints spacing
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print("*\t");
            }
             System.out.println();
        }
    }
}
*/