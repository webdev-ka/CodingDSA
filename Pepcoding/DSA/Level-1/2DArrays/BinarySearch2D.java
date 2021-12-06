import java.util.Scanner;       
 public class BinarySearch2D
 {
     public static void main(String args[]){
      
        Scanner sc=new Scanner(System.in);
        //Taking 2D Array as input
        int n=sc.nextInt();//row of 2d array  
        int m=sc.nextInt();//column of first matrix
        int A[][]=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }  
