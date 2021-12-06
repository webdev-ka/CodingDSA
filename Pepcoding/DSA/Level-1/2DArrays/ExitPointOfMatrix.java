/* Print the element row and column at which the control exits the matrix 

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix
 */
 
 import java.util.Scanner;       
 public class ExitPointOfMatrix
 {
     public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }  

        int dir=0,i=0,j=0;
        while(true){
            dir=dir+arr[i][j]%4;
            if(dir==0){
                j++;
                if(j==arr[0].length)
                {
                    j--;
                    break;
                }
            }
            else if(dir==1){
                i++;
                if(i==arr.length)
                {
                    i--;
                    break;
                }
            }
            else if(dir==2){
                j--;
                if(j==-1)
                {
                    j++;
                    break;
                }
            }
            else if(dir==3){
                i--;
                if(i==-1)
                {
                    i++;
                    break;
                }
            }
        }    
        System.out.println("Exit Point: ("+i+","+j+")");
     }
 }