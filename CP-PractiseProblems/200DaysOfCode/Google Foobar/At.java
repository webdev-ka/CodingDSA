import java.util.*;
import java.math.BigInteger; 
class At
{
	public static void main(String[] args) {
		int xs[]={-963, -524, 35, 804, 443, 661, -770, -567, -234, 714},i=0;
		BigInteger maximum,minimum,m,temp;
		maximum=minimum=m=BigInteger.valueOf(xs[0]);
		while(i<xs.length&&xs[i]==0){i+=1;}
		if(i!=xs.length)
		
			maximum=minimum=m=BigInteger.valueOf(xs[i]);
		
		for(i=i+1;i<xs.length;i++)
		{
			if(xs[i]<0)
			{temp=maximum;
				maximum=minimum;
				minimum=temp;
		}
		
			if(xs[i]!=0){
			maximum=(BigInteger.valueOf(xs[i]).multiply(maximum)).max(BigInteger.valueOf(xs[i]));
			minimum=(BigInteger.valueOf(xs[i]).multiply(minimum)).min(BigInteger.valueOf(xs[i]));
			}
			else{
			maximum=maximum.max(BigInteger.valueOf(xs[i]));
			minimum=minimum.min(BigInteger.valueOf(xs[i]));
			}
			m=m.max(maximum);
			System.out.println("maximum"+maximum+"minimum"+minimum+"result"+m);

		}
		System.out.println(String.valueOf(m));
		}
	}


