/*Input:


*/

import java.util.Scanner;
public class WaveDisplay{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int gap=0;gap<arr[0].length;gap++){
            for(int i=0;j=0;j<arr[0].length;j++,i++)
            {
                System.out.println(arr[i][j]);
            }
           
            
           
        }
    }

}