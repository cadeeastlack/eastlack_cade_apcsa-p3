//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String first = a.substring(0,1);
	   String last = a.substring(a.length()-1, a.length());
	
	   String checkString = "aeiouAEIOU";
	   if(checkString.indexOf(last) >= 0 || checkString.indexOf(first) >= 0) {
		   return "yes";
	   }
	   
	   return "no";
	}
}