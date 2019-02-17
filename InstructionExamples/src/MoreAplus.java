//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class MoreAplus
{
   public static String go( String a )
	{
	   
	   int aPlusCheck = a.indexOf("aplus");
	   if(aPlusCheck > -1) {
		   if(a.indexOf("aplus", aPlusCheck + 1) > -1) {
			  return "yes"; 
		   }
	   }
	   return "no";
	}
}
