//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover letmove = new LetterRemover();
		
		letmove.setRemover("I am Sam I am", 'a');
		System.out.println(letmove.toString());
		System.out.println(letmove.removeLetters());
	}
}