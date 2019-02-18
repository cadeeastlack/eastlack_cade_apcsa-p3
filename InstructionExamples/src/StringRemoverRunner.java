//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringRemover test1 = new StringRemover();
		
		test1.setRemover("xR-MxR-MHelloxR-M", "R-M");	
		System.out.println(test1.toString());
		System.out.println(test1.removeStrings());
		
		test1.setRemover("sxsssxssxsxssexssxsesss", "xs");	
		System.out.println(test1.toString());
		System.out.println(test1.removeStrings());
		
		test1.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");	
		System.out.println(test1.toString());
		System.out.println(test1.removeStrings());
	}
}