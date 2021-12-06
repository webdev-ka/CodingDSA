/*
Problem
Li has planned a bike tour through the mountains of Switzerland. His tour consists of N checkpoints, numbered from 1 to N in the order he will visit them. The i-th checkpoint has a height of Hi.

A checkpoint is a peak if:
It is not the 1st checkpoint or the N-th checkpoint, and
The height of the checkpoint is strictly greater than the checkpoint immediately before it and the checkpoint immediately after it.

Please help Li find out the number of peaks.

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case begins with a line containing the integer N. The second line contains N integers. The i-th integer is Hi.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the number of peaks in Li's bike tour.
*/

import java.util.*;
public class BikeTour
{static int test=1;
  private static Scanner sc;
    public static void main(String args[])throws Exception
{int t,n;
sc=new Scanner(System.in);
    t=sc.nextInt();
    while(t-->0)
    {
      find();
    }
  } 
  public static void find()
{int i,n;

n=sc.nextInt();
  int h[]=new int[n];
  for(i=0;i<n;i++)
  {
      h[i]=sc.nextInt();
    }
  
  System.out.println("Case #"+(test++)+": "+noPeak(h));
    
} 
public static int noPeak(int h[])
{int c=0;
for(int i=1;i<h.length-1;i++)
{
  if(h[i]>h[i+1]&&h[i]>h[i-1])
  ++c;}
  return c;

}

}
