/*
n=5
arr[]={3,1,0,7,5}
Prints:An inverted bar chart of asteriks representing value of array a
*	*		*	*	
*			*	*	
*			*	*	
			*	*	
			*	*	
			*		
			*	

*/

import java.io.*;
import java.util.*;

public class InvertedBarChartPattern {
    //finding maximum array value 
    public static int maximum(int arr[]){
        int max=Integer.MIN_VALUE;//intial max value
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            max=arr[i];
        }
        return max;
    }
  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();//Take size of array
    int arr[]=new int[n];//declaring n size array
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();//take array inputs
    }
    //print asteriks acc to arr[i] value row wise
    int max=maximum(arr);
    for(int i=0;i<max;i++){//no of rows are equal to maximum value of array(for eg:7 in example)
        for(int j=0;j<n;j++)//columns are equal to number of array values
        {
            if(arr[j]>0)//if array value is greater than 0 then print asterik
            {
             System.out.print("* ");
             arr[j]--;//as you go to new row reduce the array value
             }
            else 
            System.out.print("	");//if array value is 0 then print space
           
        }
        System.out.println();//go to nextline for next row
    }
  }

}