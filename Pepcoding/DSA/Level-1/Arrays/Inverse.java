/* Inverse of Array Problem-Interchange indices and values in array
1. You are given a number n, representing the size of array a.
2. Array contains unique elements from 0 to n-1 range.
3. You are required to calculate the inverse of array a.
How to  calculate inverse of array:
the value at ith position in original array becomes index of inverse array
the ith position of original array becomes value in inverse array

Original Array: 2 4 1 0 3
 indexing:      0 1 2 3 4

Inverse Array: 3 2 0 4 1
 indexing:     0 1 2 3 4
 */

import java.util.Scanner;
public class Inverse{
    static int[] findInverse(int arr[]){
        int inverse[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            
            inverse[arr[i]]=i;
            
        }
        return inverse;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int arr[]=new int[n];
          for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int inverse[]=findInverse(arr);
         for(int i=0;i<n;i++){
            System.out.print(inverse[i]+" "); 
         }
    }
    }