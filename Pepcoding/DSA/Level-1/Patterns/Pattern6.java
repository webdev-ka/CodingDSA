/*
For n=7, prints:
*	*	*	*		*	*	*	*	
*	*	*				*	*	*	
*	*						*	*	
*								*	
*	*						*	*	
*	*	*				*	*	*	
*	*	*	*		*	*	*	*	

2codes use whichever you like
*/
//Sir's Approach-By using formula(refer to notes)
import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    

    //Upper half
        for(int i=1;i<=(n/2)+1;i++)
        {   
            //Spacing
            for(int j=1;j<=n/2-i+1;j++)//Spacing starts
            {
                System.out.print("\t");
            }
            //Printing Star(*)
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*\t");
            }
            
             System.out.println();
        }
        
          //Lower half
        for(int i=1;i<=(n/2);i++)
        {   
            //Spacing
            for(int j=1;j<=i;j++)
            {
                System.out.print("\t");
            }
            //Printing Star(*)
            for(int j=1;j<=n-(2*i);j++)
            {
                System.out.print("*\t");
            }
            
             System.out.println();
        }

    }
}
/*MyApproach Code2
use spacecount variable
This is similar to Pattern5 instead of space print star and in place of star print space

import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

    int n=scn.nextInt();
    

    //Upper half
        for(int i=1,spacecount=1;i<=(n/2)+1;i++,spacecount+=2)
        {   //spacecount to keep of count of stars to print in each row initally they are1 and increment by 2
            //Printing star-1
            for(int j=n/2+1;j>=i;j--)//start from n/2 to i for star
            {
                System.out.print("*\t");
            }
            //Printing Star(*)
            for(int j=1;j<=spacecount;j++)
            {
                System.out.print("\t");
            }
             //Printing star-2 similar to part1
             for(int j=n/2+1;j>=i;j--)//start from n/2 to i for star
            {
                System.out.print("*\t");
            }
            //Printing Star(*)
             System.out.println();
        }//end of row loop of upper half
        
         //Lower half
        for(int i=1,spacecount=n-2;i<=(n/2);i++,spacecount-=2)
        {   //spacecount to keep of count of stars to print in each row initally they are n-2 and decrement by 2
            //Spacing
            for(int j=1;j<=i+1;j++)//no of space equal to ith row
            {
                System.out.print("*\t");
            }
            //Printing Star(*)
            for(int j=1;j<=spacecount;j++)//printing stars 
            {
                System.out.print("\t");
            }
             for(int j=1;j<=i+1;j++)//no of space equal to ith row
            {
                System.out.print("*\t");
            }
             System.out.println();
        }//end of lower half row loop

    }
}
*/