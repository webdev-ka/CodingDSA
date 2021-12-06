import java.util.*;
class CountDigitsUsingRecursion{
	/*Count number of digits in a number*/
	public static int count_digits_of_number(int n){
		if(n==0)
			return 0;
		return 1+count_digits_of_number(n/10);	

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//Enter number
		
		int result=count_digits_of_number(n);
		System.out.println(result);//print result
	}
}