/* Alice and Bob has 2 array of chocolate find the chocolates both have in common*/
/*Logic
1) Sort smaller array
2)a) for every element in larger array apply binary search in sorted smaller array
  b)I found copy it to ouput arraylist*/


import java.io.*;
import java.util.*;
class Chocolate
{
static boolean binary(String arr[],int len,String item)
{boolean flag=false;
int beg=0,mid;
int end=len-1;
while(beg<=end)
{mid=(beg+end)/2;
if(arr[mid].equals(item)){
flag=true;
break;}
else if(arr[mid].compareTo(item)>0)
end=mid-1;
else if(arr[mid].compareTo(item)<0)
beg=mid+1;
}
return flag;
}

static ArrayList<String> find(int max,int min,String mx[],String mn[])
{ArrayList<String> c=new ArrayList<String>();
Arrays.sort(mn);
int i,k=0;
for(i=0;i<max;i++)
{
if(binary(mn,min,mx[i]))
c.add(mx[i]);
}
return c;
}
public static void main(String args[])throws Exception
{int m,n,i;
ArrayList<String> out=new ArrayList<String>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

m=Integer.parseInt(br.readLine());
String a[]=new String[m];
n=Integer.parseInt(br.readLine());
String b[]=new String[n];
System.out.println("enter Alice chocolate");
for(i=0;i<m;i++)
{a[i]=br.readLine();}
System.out.println("enter Bob chocolate");
for(i=0;i<n;i++)
{b[i]=br.readLine();}

if(m>n)
out=find(m,n,a,b);
else
out=find(n,m,b,a);
System.out.println("Common chocolate");
for(i=0;i<out.size();i++)
System.out.println(out.get(i));

}}