import java.util.*;
public class PrintAllPalindromeStrings{
    public static boolean isPalindrome(String s){
    int left=0;
    int right=s.length();
    boolean flag=true;//let string be palindrome initially
    while(left<right)
    {
        char charleft=s.charAt(left);
        char charright=s.charAt(right);
        if(charleft!=charright){
            flag=true;
            break;
        }
        left++;
        right--;
    }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++)
            {   String ss=s.substring(i,j);
                if(isPalindrome(ss))
                System.out.println(ss);
            }
        }
    }
}