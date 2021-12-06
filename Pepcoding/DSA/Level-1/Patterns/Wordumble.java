import java.util.*;
class Wordumble
{static char ch='y';
	static int score,choice;
	static String jumbled[][]={{"papel","apple"},{"naaban","banana"},{"erap","pear"},{"catenocsif","confiscate"},{

		"radmaint","tamarind"},{"anoegr","orange"},{"eclchi","cliche"},{"esehcc","cheese"}};
	public static void main(String[] args) {
	System.out.println("1:Play Game");
	System.out.println("2:Show Instructions");
	System.out.println("3:Exit Game");
	System.out.println("Enter your choice");
	Scanner sc=new Scanner(System.in);
	while(ch=='y'){
	choice=sc.nextInt();
	switch(choice)
	{
		case 1:play();
				break;
		case 2:instruct();
				break;
		case 3:exitgame();
				break;
		default:System.out.println("Invalid Choice");}
		System.out.println("Want to Continue? y/n");
		ch=sc.next().charAt(0);
}
}
static void play(){
	String s,str,strr="";
	int count=5;
	Random r=new Random();
	Scanner sc=new Scanner(System.in);
	int select=r.nextInt(jumbled.length);
	str=jumbled[select][1];
	System.out.println(jumbled[select][0]);
	while(count-->0){
		System.out.println("Type your answer");
		s=sc.nextLine();
	if(s.equals(str))
		{System.out.println("Hurray!! Correct Answer"); return;}
	else
		System.out.println("Oops! Wrong Answer Try Again "+count+" chances left");}
	if(count==0)
		System.out.println("Sorry You are out of chances");
}
static void instruct(){
System.out.println("You will get a jumbled word You need to unscramble it and give answer.If you give right answer you will get 100 points.You have only 5 attempts to give right answer");
}
static void exitgame(){
	ch='n';
	return;
}
}