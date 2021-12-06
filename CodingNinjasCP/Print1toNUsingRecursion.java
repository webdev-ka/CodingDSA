import java.util.*;
class Print1toNUsingRecursion{
	/*Print number 1 to n*/
	public static void print_ascending_order(int n){
		if(n==0)
			return;
		print_ascending_order(n-1);//first goto 1 by decrementing continuously then start printing as you return
		System.out.print(n+" ");

	}
	/*Print number from n to 1*/
	public static void print_descending_order(int n){
		if(n==0)
			return;
		System.out.print(n+" ");//first print number then recursive call to decrement
		print_descending_order(n-1);
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//Enter number
		System.out.println("Number from 1 to "+n+" in ascending order:");
		print_ascending_order(n);
		System.out.println("\nNumber from 1 to "+n+" in descending order:");
		print_descending_order(n);
	}
}
