/**
Question:
Problem Description: You are given an array of n integers representing the number of chocolates in n packets. There are m students (m <= n) and these packets should be distributed among these m students, so that each student gets one packet and the difference between the highest no. of chocolates given to a student and the lowest no. of chocolates given to another student should be minimum. Print the minimum difference obtained.
 */

import java.util.*;

public class ChocolateCartonDistribution {
    
  public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();//Take size of array(no of chocolate boxes)
    int arr[]=new int[n];//declaring n size array
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();//take array inputs(no of chocolates n ith box)
    }
    int m=sc.nextInt();//taking no of students as input

    
    int start=0,end=m-1,new_diff=0,diff;
    diff=Integer.MAX_VALUE;//let initial difference be a very large value
    int pos1=0,pos2=m-1;// to maintain the start and end indices of the subarray which is chosen to be distributed among studenst

    Arrays.sort(arr);//sort the array

    while(end<n){//run the loop till end is less than chocolate boxes
      new_diff=arr[end]-arr[start];//calcuate difference between max and min o of chocolates in the subarray
      if(new_diff<diff)  //if new_diff less than existing difference
      {
          diff=new_diff;//assign new diff to diff
            pos1=start;//store start index of the subarray whose chocolates will be distributes
            pos2=end;//store end index of the subarray whose chocolates will be distributes
      }
      start++;//increment start and end indices counter
      end++;
    } 

    /*Print the minimum difference */
    System.out.println("Minimum difference between highest and lowest number of chocolates is: "+diff);   
    
    /*Print the boxes that have min difference b/w lowest and highest no of chocolates
    ,that is, the m boxes choosen to be distributed among m students */
    
    System.out.println("Chocolate boxes distributed among "+m+" students are:");
    for(int i=pos1;i<=pos2;i++){
        System.out.print(arr[i]+"\t");
    }

  }//end of main
}//end of class

/**Geeks for Geeks SOlution: 
public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        // if there are no chocolates or 
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;

     
        // Number of students cannot be
        // more than number of packets
        if (n < m)
           return -1;

        int start=0,end=(int)m-1;
        long new_diff,diff;
        diff=Long.MAX_VALUE;//let initial difference be a very large value
         Collections.sort(a);//sort the array
        
            while(end<n){//run the loop till end is less than chocolate boxes
              
              new_diff=a.get(end)-a.get(start);//calcuate difference between max and min o of chocolates in the subarray
              if(new_diff<diff)  //if new_diff less than existing difference
              {
                  diff=new_diff;//assign new diff to diff
                   
              }
              start++;//increment start and end indices counter
              end++;
            } 
        return diff;
    }
}

 */