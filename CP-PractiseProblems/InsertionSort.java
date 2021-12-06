class InsertionSort{
void insert_sort(int a[])
{int i,key=a[0],j;
for(i=1;i<a.length;i++){
key=a[i];
j=i-1;
while(j>-1&&key<a[j])
{a[j+1]=a[j];
j=j-1;}
a[j+1]=key;}
for(i=0;i<a.length;i++)
System.out.println(a[i]);
}
public static void main(String args[])throws Exception
{
int a[]={9,7,8,4,2,0};
InsertionSort obj=new InsertionSort();
obj.insert_sort(a);
}}