//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MultTens
{
	public static String go(  int x )
	{
		String sum = "";
		
		if(x<=0) {
			return "aplus";
		}
		else
			for(int i = 10; i<=x*10 ; i= i+10) {
				sum += i;				
			}
			return sum;
	}
}