import java.util.Scanner;
public class BinarySearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int beg=0,end=n-1,mid,foundAt=-1;
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();
            while(beg<=end){
                mid=(beg+end)/2;
              
                if(data<arr[mid])
                    end=mid-1;
                else if(data>arr[mid])
                   beg=mid+1;
                else if(data=arr[mid])
                {
                    foundAt=mid;
                    break;
                }
            }
            if(foundAt==-1)
            System.out.println(data+" not found");
            else
            System.out.println(data+ " found at " + (foundAt+1));
    }
}