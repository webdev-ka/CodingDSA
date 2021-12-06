import java.util.*;

public class Main {
public static boolean isPossible(int d,int c,int stalls[]){    
    int last_pos=stalls[0];
    int count=1;
	for(int i=1;i<stalls.length;i++){
    if(stalls[i]-last_pos>=d)
    {
        last_pos=stalls[i];
        count+=1;
    }
    if(count==c)
        return true;
}
return false;
}
public static int solve(int n,int c,int stalls[]){
    int min,max,mid;
   min=0;
   int ans=-1;
    max=stalls[n-1]-stalls[0];
    Arrays.sort(stalls);
    while(min<=max){
    	mid=(min+max)/2;
        if(isPossible(mid,c,stalls))
        	{ans=mid;
                min=mid+1;}

        else
            max=mid-1;
    }
  
    
    return ans;
}
	
	public static void main(String[] args) {
		// Write your code here
Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int stalls[]=new int[n];
            int c=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                stalls[j] =sc.nextInt();
            }
            System.out.println(solve(n,c,stalls));
        }
    
    }

}