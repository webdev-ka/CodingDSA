import java.util.*;
public class Record
{static int test=1;
  private static Scanner sc;
    public static void main(String args[])throws Exception
{int t;
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
  int v[]=new int[n];
  for(i=0;i<n;i++)
  { v[i]=sc.nextInt();
  }
  System.out.println("Case #"+(test++)+": "+check(v));
    } 
public static int check(int v[])
{int c=0,r=0;
for(int i=0;i<v.length;i++)
{
  if(i==0&&v[i]>v[i+1])
  ++c;
  else{r=0;
    for(int j=0;j<i;j++)
  {
      if(v[j]<v[i]){++r;
        continue;
      }
 }
  if((r==i)&&(i==v.length-1||v[i]>v[i+1]))
    {
++c;}
}

  }

  
return c;

  
}
}
