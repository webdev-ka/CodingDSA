import java.util.*;
class PowerUsingRecursion{
	public static int power_of_number(int n,int p){
		if(p==0)
			return 1;
		return n*power_of_number(n,p-1);//calculate n^p	

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//Enter number
		int p=sc.nextInt();//Enter power
		int result=power_of_number(n,p);
		System.out.println(result);//print result
	}
}