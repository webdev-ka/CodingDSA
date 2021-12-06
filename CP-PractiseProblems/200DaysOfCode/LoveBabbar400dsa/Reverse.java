import java.util.*;
import java.lang.*;
import java.io.*;
/*Given a string S as input. You have to reverse the given string.

Input: First line of input contains a single integer T which denotes the number of test cases. T test cases follows, first line of each test case contains a string S.

Output: Corresponding to each test case, print the string S in reverse order.*/
class Reverse {
	public static void main (String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=t;i++){
		    StringBuffer s= new StringBuffer(sc.nextLine());
		    System.out.println(s.reverse());
		}
	}
}
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends

//User function Template for Java


class Reverse
{
    // Complete the function0.19s
    // str: input string
    public static String reverseWord(String str)
    {
    int len=str.length();
        // Reverse the string str
        if(len==0)
        return "";
        return str.charAt(len-1)+reverseWord(str.substring(0,len-1));
    }
}
class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends

//User function Template for Java


class Reverse
{
    // Complete the function 0.12 s
    // str: input string
    public static String reverseWord(String str)
    {StringBuffer s= new StringBuffer(str);
		    return s.reverse().toString();
}}

//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function .21s
    // str: input string
    public static String reverseWord(String str)
    {String s="";
        // Reverse the string str
        for(int i=str.length()-1;i>=0;i--){
           s+=str.charAt(i);
        }
        return s;
    }
}