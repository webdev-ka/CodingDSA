public class FoobarChallenge1 {
   public static void main(String args[]) {
    	//Your code here
    	String x="abcabcabc";
int i=0,count=0,c=0;
String m="",z="";

for(i=1;i<=x.length();i++){
	m="";
	z=x.substring(0,i);
	count=c=x.split(z,-1).length-1;
	
	while(count-->0){
	m+=z;
	}

	if(m.equals(x))
	{System.out.println(c);
	break;
}
}
	
    }
}