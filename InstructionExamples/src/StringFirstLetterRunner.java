//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		StringFirstLetterCheck test = new StringFirstLetterCheck();
		
		out.println("Enter 2 words :: ");
		String wordOne = keyboard.nextLine();
		String wordTwo = keyboard.nextLine();
		
		test.setWords(wordOne, wordTwo);
		test.checkFirstLetter();
		out.println(test.toString());
	}
}