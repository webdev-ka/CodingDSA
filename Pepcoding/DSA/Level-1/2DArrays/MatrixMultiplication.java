import java.util.Scanner;       
 public class ExitPointOfMatrix
 {
     public static void main(String args[]){
      
        Scanner sc=new Scanner(System.in);
        //Taking first matrix as input
        int n1=sc.nextInt();//row of first matrix   
        int m1=sc.nextInt();//column of first matrix
        int A[][]=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }  

         //Taking second matrix as input
        int n2=sc.nextInt();//row of first matrix   
        int m2=sc.nextInt();//column of first matrix
        int B[][]=new int[n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }

        if(m1!=n2)//if first matrix column not equal to second matrix row then print invalid input and come out of program
        {
            System.out.println("Invalid Input");
            return;//exit the program i,e control comes out of the program
        }  

        //if input is valid then declare output mattix AB=A*B
        //Size of AB is n1*m2(A matrix rows * B matrix Columns)

        int AB[][]=new int[n1][m2];

        //Matrix Multiplication

        for(int i=0;i<AB.length;i++){
            for(int j=0;j<AB[0].length;j++){
                int val=0;
                for(int k=0;k<m1;k++){
                    val+=A[i][k]*B[k][j];
                     
                }
               AB[i][j]=val;
            }
        }

        //Printing Output Matrix
        for(int i=0;i<AB.length;i++){
        for(int j=0;j<AB[0].length;j++){
            System.out.print(AB[i][j]+" ");}
            System.out.println();}
     }
 }