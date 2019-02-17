//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class First
{
   public static String go( String a )
	{
		int length = a.length();
		if(length <= 1) {
			return "no";
		}	
		
		String firstLetter = a.substring(0,1);
		if(a.indexOf(firstLetter,1) > -1) {
				return "yes";
		}
	   
	   return "no";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/